const express = require('express');
const fetch = require('node-fetch');
const app = express();

app.use(express.json());

const HF_API_TOKEN = process.env.HF_API_TOKEN;
const HF_API_URL = 'https://api-inference.huggingface.co/models/facebook/blenderbot-400M-distill';

app.get('/', (req, res) => res.send('Chatbot backend is running!'));

app.post('/chat', async (req, res) => {
  const userMessage = req.body.message || 'Hello!';
  const pageContext = req.body.context || '';
  const inputText = pageContext ? `${pageContext}\n\nUser: ${userMessage}` : userMessage;

  try {
    const response = await fetch(HF_API_URL, {
      method: 'POST',
      headers: {
        'Authorization': `Bearer ${HF_API_TOKEN}`,
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ inputs: inputText }),
    });
    const data = await response.json();
    res.json({ reply: data.generated_text || 'Sorry, I didn’t understand.' });
  } catch (error) {
    res.status(500).json({ reply: 'Something went wrong!' });
  }
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
