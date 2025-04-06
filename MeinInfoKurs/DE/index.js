// Import necessary libraries
const express = require('express');  // Example: Using Express to create a web server
const { OpenAI } = require('openai');  // Import the OpenAI package

// Initialize OpenAI with the API key from environment variables
const openai = new OpenAI({
  apiKey: process.env.OPENAI_API_KEY,  // This gets the API key from Render's environment variables
});

// Create an Express app
const app = express();

// Middleware to parse incoming JSON data
app.use(express.json());

// Example route to interact with OpenAI and generate a response
app.post('/chat', async (req, res) => {
  const { message } = req.body;  // Get the message from the request body
  
  if (!message) {
    return res.status(400).send({ error: 'Message is required' });
  }

  try {
    // Request to OpenAI API for a response
    const response = await openai.chat.completions.create({
      model: 'gpt-4.0-mini',  // Model specification
      messages: [{ role: 'user', content: message }],  // Send the user's message
    });

    // Send the generated response back to the user
    res.json({ reply: response.choices[0].message.content });
  } catch (error) {
    console.error('Error interacting with OpenAI:', error);
    res.status(500).send({ error: 'An error occurred while processing your request.' });
  }
});

// Start the server, using the PORT environment variable or defaulting to 3000
const port = process.env.PORT || 3000;
app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
