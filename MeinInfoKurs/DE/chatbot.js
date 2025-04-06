const backendUrl = 'https://david-cmrg-github-io.onrender.com'; // Render URL

function toggleChat() {
  const chatPopup = document.getElementById('chat-popup');
  chatPopup.style.display = chatPopup.style.display === 'flex' ? 'none' : 'flex';
}

function addMessage(text, isUser = false) {
  const chatbox = document.getElementById('chatbox');
  const div = document.createElement('div');
  div.textContent = text;
  div.className = isUser ? 'user' : 'bot';
  chatbox.appendChild(div);
  chatbox.scrollTop = chatbox.scrollHeight;
}

async function sendMessage() {
  const messageInput = document.getElementById('message-input');
  const message = messageInput.value.trim();
  if (!message) return;

  addMessage(message, true);
  messageInput.value = '';

  const pageContent = document.body.innerText.slice(0, 1000);

  try {
    const response = await fetch(backendUrl, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ message, context: pageContent }),
    });
    const data = await response.json();
    const botReply = data.reply || 'Hmm, I didn’t catch that.';
    addMessage(botReply);
  } catch (error) {
    addMessage('Error: Can’t reach the chatbot.');
    console.error('Fetch error:', error);
  }
}

document.addEventListener('DOMContentLoaded', () => {
  const messageInput = document.getElementById('message-input');
  messageInput.addEventListener('keypress', (e) => {
    if (e.key === 'Enter') sendMessage();
  });
  addMessage('Hi! I can help with this page or anything else. What’s up?');
});
