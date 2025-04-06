require('dotenv').config();  // Load environment variables

const express = require('express');
const path = require('path');
const { OpenAI } = require('openai');
const app = express();
const port = process.env.PORT || 3000;

// Serve static files directly from the root directory
app.use(express.static(path.join(__dirname)));

// Parse JSON bodies for the chatbot functionality
app.use(express.json());

// Initialize OpenAI API
const openai = new OpenAI({
  apiKey: process.env.OPENAI_API_KEY,
});

// Define chatbot route
app.post('/ask', async (req, res) => {
  const { message, pageContent } = req.body;

  try {
    const response = await openai.chat.completions.create({
      model: 'gpt-4',
      messages: [
        { role: 'system', content: 'You are a helpful assistant.' },
        { role: 'user', content: `Website content: ${pageContent}. Question: ${message}` },
      ],
    });

    res.json({ answer: response.choices[0].message.content });
  } catch (error) {
    res.status(500).json({ error: 'Error processing request' });
  }
});

// Serve additional pages from the 'Seiten' directory
app.get('/seiten/*', (req, res) => {
  const filePath = path.join(__dirname, 'Seiten', req.params[0]);
  res.sendFile(filePath);
});

// Serve the main page
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'index.html'));
});

// Start the server
app.listen(port, () => {
  console.log(`Server running on port ${port}`);
});
