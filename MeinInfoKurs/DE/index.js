require('dotenv').config(); // Load environment variables from .env file

const express = require('express');
const { OpenAI } = require('openai');
const app = express();
const port = process.env.PORT || 3000;

app.use(express.json());

const openai = new OpenAI({
  apiKey: process.env.OPENAI_API_KEY,  // Read API key from environment variable
});

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
    res.status(500).json({ error: 'Error in processing request' });
  }
});

app.listen(port, () => {
  console.log(`Server running on port ${port}`);
});
