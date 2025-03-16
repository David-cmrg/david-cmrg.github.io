<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="../../style.css">
    <script src="../../script.js"></script>
    <script src="https://kit.fontawesome.com/c629f9a56e.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-3759386961615231"
     crossorigin="anonymous"></script>
    <title>MeinInfoKurs | Variablenrätsel.java</title>
</head>
<body>
    <!-- Navigationsleiste Smartphones -->
    <div class="hamburger" onclick="toggleMenu()">
        <div></div>
        <div></div>
        <div></div>
    </div>
    <!-- Navigationsleiste Monitore -->
    <nav id="sidebar">
        <h2 class="titleMain" style="margin:2.3vh 0vh 15vh 0vh;">MeinInfoKurs</h2>
        <ul>
            <li><i class="fa-solid fa-house"></i>  <a href="../../index.html">Startseite</a></li>
            <li><i class="fa-brands fa-java fa-xl"></i>  <a href="../JavaEditor/Java.html">Java</a></li>
            <li><i class="fa-solid fa-bug fa-lg"></i>  <a href="fehlersuche.html">Fehler Suche</a></li>
            <li><i class="fa-solid fa-book"></i>  <a href="docs.html">Dokumentation</a></li>
            <li><i class="fa-solid fa-school"></i>  <a href="https://www.w3schools.com/" target="_blank">W3Schools</a></li>
            <li><i class="fa-solid fa-circle-info fa-lg"></i>  <a href="../support.html">Support</a></li>
        </ul>
        <!-- From Uiverse.io by satyamchaudharydev --> 
        <label class="switch">
            <input type="checkbox">
            <span class="slider"></span>
        </label>
    </nav>

    <!-- Main Content Area -->
    <main>
        <div id="nav-title-verifystatus">
            <h1 id="titlePage">Das Ratespiel</h1>
            <i class="fa-solid fa-hourglass-half fa-xl nicht-verifiziert" title="Noch nicht verifizierter Code. Es könnte noch Fehler geben!" id="code-status-display"></i>
        </div>
        <button id="toggle-history"><i class="fa-solid fa-clock-rotate-left fa-xl"></i></button>

        <!-- Das modale Fenster -->
        <div id="history-modal">
            <div id="history-content">
                <span id="close-history">&times;</span> <!-- Schließen-Button -->
                <h3>ZULETZT ANGESEHEN</h3>
                <ul id="recent-topics"></ul>
            </div>
        </div>

        <p>
            Bitte warten Sie auf erstellung der Seite. (Zuletzt aktualisiert: 16.03.2025)
        </p>


        <section class="vorherige-naechste">
            <a href="Millionaere.html" class="error-bg">
                <article>
                    <h4><i class="fa-regular fa-circle-left fa-xl"></i>  Vorherige Aufgabe</h4>
                </article>
            </a>
            <a href="StiftUndPapier.html" class="error-bg">
                <article>
                    <h4>Nächste Aufgabe  <i class="fa-regular fa-circle-right fa-xl"></i></h4>
                </article>
            </a>
        </section>

    </main>
    <script>
        function cleanCode(text) {
            return text.replace(/\u00A0/g, ' ').trim();
        }

        function copyCode() {
            const code = document.getElementById('codeBlock').innerText;
            navigator.clipboard.writeText(cleanCode(code));
            alert('Code copied to clipboard!');
        }
        
        function downloadCode() {
            const code = document.getElementById('codeBlock').innerText;
            const blob = new Blob([cleanCode(code)], { type: 'text/plain' });
            const a = document.createElement('a');
            a.href = URL.createObjectURL(blob);
            a.download = 'Ratespiel.java';
            document.body.appendChild(a);
            a.click();
            document.body.removeChild(a);
        }
    </script>
</body>
</html>
