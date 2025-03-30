window.addEventListener("scroll", function () {
    let scrollPos = window.scrollY;
    let maxScroll = window.innerHeight * 0.6; // Starts the fade little bit earlier

    let opacity = 1 - (scrollPos / maxScroll);

    // Prevent opacity from going below 0 or above 1
    opacity = Math.max(0, Math.min(1, opacity));

    document.querySelector("#startscreen-dynamic").style.opacity = opacity;
    document.querySelector("#canvas-webgl").style.opacity = opacity;
});                




document.addEventListener("DOMContentLoaded", function () {
    const sections = document.querySelectorAll("main p[id]");
    const navItems = document.querySelectorAll("nav .list-item");
    const homeNav = document.getElementById("homeNav");

    function changeActiveNav(targetId) {
        navItems.forEach((item) => {
            item.classList.remove("active");
        });

        if (targetId === "home") {
            homeNav.classList.add("active");
        } else {
            let targetNav = document.querySelector(`nav .list-item a[href="#${targetId}"]`);
            if (targetNav) {
                targetNav.parentElement.classList.add("active");
            }
        }
    }

    window.addEventListener("scroll", function () {
        let scrollPos = window.scrollY + 100;

        if (window.scrollY === 0) {
            changeActiveNav("home");
        } else {
            sections.forEach((section) => {
                if (scrollPos >= section.offsetTop && scrollPos < section.offsetTop + section.offsetHeight) {
                    changeActiveNav(section.id);
                }
            });
        }
    });

    window.scrollToTop = function () {
        window.scrollTo({ top: 0, behavior: "smooth" });
        changeActiveNav("home");
    };
});
