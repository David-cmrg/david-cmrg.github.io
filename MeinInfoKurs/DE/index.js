const { OpenAI } = require('openai');

// Initialize OpenAI client with API key from environment variables
const openai = new OpenAI({
  apiKey: process.env.OPENAI_API_KEY, // Set this in Render's dashboard
});

// Example function to test OpenAI API
async function testOpenAI() {
  try {
    const response = await openai.chat.completions.create({
      model: 'gpt-3.5-turbo', // Adjust model as needed
      messages: [{ role: 'user', content: 'Hello from Render!' }],
      max_tokens: 50,
    });
    console.log('Response from OpenAI:', response.choices[0].message.content);
  } catch (error) {
    console.error('Error with OpenAI API:', error.message);
  }
}

// Run the test function
testOpenAI();

// Keep the process alive for Render
process.on('uncaughtException', (err) => {
  console.error('Uncaught Exception:', err.message);
});
