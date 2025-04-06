const fetch = require('node-fetch'); // Add this dependency in package.json

// Simple Express server to handle chatbot requests
const express = require('express');
const app = express();
app.use(express.json());

const HF_API_TOKEN = process.env.HF_API_TOKEN; // Set this in Render
const HF_API_URL = 'https://api-inference.huggingface.co/models/facebook/blenderbot-400M-distill';

app.get('/', (req, res) => {
  res.send('Chatbot backend is running!');
});

app.post('/chat', async (req, res) => {
  const userMessage = req.body.message || 'Hello!';

  try {
    const response = await fetch(HF_API_URL, {
      method: 'POST',
      headers: {
        'Authorization': `Bearer ${HF_API_TOKEN}`,
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ inputs: userMessage }),
    });

    const data = await response.json();
    const botReply = data.generated_text || 'Sorry, I didn’t understand that.';
    res.json({ reply: botReply });
  } catch (error) {
    console.error('Error with Hugging Face API:', error.message);
    res.status(500).json({ reply: 'Something went wrong!' });
  }
});

// Listen on Render’s required port
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
