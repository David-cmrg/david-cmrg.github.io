        function toggleMenu() {
            document.getElementById("sidebar").classList.toggle("active");
        }
        document.addEventListener("click", function(event) {
    let menu = document.getElementById("sidebar");
    let hamburger = document.querySelector(".hamburger");
    
    if (!menu.contains(event.target) && !hamburger.contains(event.target)) {
        menu.classList.remove("active");
    }
});

document.addEventListener('contextmenu', function(event) {
    event.preventDefault();
    });

function revealContent() {
            document.getElementById("blurDivID").classList.add("anzeigen");
            document.querySelector(".show-button").style.display = "none";
        }

        
function revealAnswer(event) {
    event.target.classList.add('anzeigen');
}



document.addEventListener("DOMContentLoaded", () => {
    const toggleSwitch = document.querySelector(".switch input"); // Select the checkbox
    const body = document.body;

    // Check local storage for dark mode preference
    if (localStorage.getItem("theme") === "dark") {
        body.classList.add("dark-mode");
        toggleSwitch.checked = true; // Keep the switch ON
    }

    // Toggle dark mode on checkbox change
    toggleSwitch.addEventListener("change", () => {
        if (toggleSwitch.checked) {
            body.classList.add("dark-mode");
            localStorage.setItem("theme", "dark"); // Save preference
        } else {
            body.classList.remove("dark-mode");
            localStorage.setItem("theme", "light"); // Save preference
        }
    });
});





document.addEventListener("DOMContentLoaded", function () {
    let modal = document.getElementById("history-modal");
    let openButton = document.getElementById("toggle-history");
    let closeButton = document.getElementById("close-history");

    // Sicherstellen, dass das Modal zu Beginn versteckt ist
    modal.classList.add("hidden");

    openButton.addEventListener("click", function () {
        displayLastVisitedTopics(); // Liste aktualisieren
        modal.classList.toggle("hidden");
    });

    closeButton.addEventListener("click", function () {
        modal.classList.add("hidden");
    });

    // Fenster schließen, wenn außerhalb des Inhalts geklickt wird
    window.addEventListener("click", function (event) {
        if (event.target === modal) {
            modal.classList.add("hidden");
        }
    });

    // Aktuelles Thema speichern und Liste laden
    saveLastVisitedTopic(document.title, window.location.href);
    displayLastVisitedTopics();
});

// Speichert das aktuelle Thema in localStorage
function saveLastVisitedTopic(title, url) {
    let topics = JSON.parse(localStorage.getItem("lastVisitedTopics")) || [];

    // Verhindern, dass doppelte Einträge gespeichert werden
    topics = topics.filter(topic => topic.url !== url);

    // Neues Thema hinzufügen
    topics.unshift({ title, url });

    // Maximale Anzahl an gespeicherten Themen (z. B. 5)
    if (topics.length > 5) {
        topics.pop();
    }

    localStorage.setItem("lastVisitedTopics", JSON.stringify(topics));
}

// Zeigt die gespeicherten Themen an
function displayLastVisitedTopics() {
    let topics = JSON.parse(localStorage.getItem("lastVisitedTopics")) || [];
    let container = document.getElementById("recent-topics");

    if (!container) return;

    // Überprüfen, ob Themen vorhanden sind
    if (topics.length === 0) {
        container.innerHTML = "<p>Keine zuletzt angesehenen Themen.</p>";
        return;
    }

    // Liste der Themen erstellen
    container.innerHTML = "";
    topics.forEach(topic => {
        let listItem = document.createElement("li");
        let link = document.createElement("a");
        link.href = topic.url;
        link.textContent = topic.title;
        listItem.appendChild(link);
        container.appendChild(listItem);
    });
}


// Disable F12, Ctrl+Shift+I, Ctrl+Shift+J, Ctrl+U (view source)
document.addEventListener("keydown", function (event) {
    if (event.key === "F12" || event.keyCode === 123 || 
        (event.ctrlKey && event.shiftKey && (event.key === "I" || event.key === "J")) || 
        (event.ctrlKey && event.key === "U")) {
        event.preventDefault();
        console.log("DevTools shortcuts are disabled.");
    }
});
