<!DOCTYPE html>
<html class="no-js" lang="en">

<head>

    <!--- basic page needs
    ================================================== -->
    <meta charset="utf-8">
    <title>Contact-us</title>
    <meta name="description" content="">
    <meta name="author" content="">

    <?php require("../includes/head.php"); ?>

</head>

<body id="top">

    <?php require("../includes/preloader.php"); ?>
    <?php require("../includes/header.php"); ?>

    <!-- footer - contact page
    ================================================== -->
    <footer class="s-footer h-dark-bg">

        <div class="right-vert-line"></div>

        <div class="row s-footer__main">
            <div class="column large-6">
                <div class="section-intro" data-aos="fade-up">
                    <h3 class="subhead">Get In Touch</h3>

                    <h1 class="display-1">
                        Have an idea or a concept that really excite you?
                        Let's turn that idea into reality. Shoot me a message.
                    </h1>
                </div>

                <div class="footer-email-us">
                    <a href="mailto:joelkmuhoho@gmail.com" class="btn btn--primary h-full-width">Let's Talk</a>
                </div>
            </div>

            <div class="column large-5">
                <div class="footer-contacts">
                    <div class="footer-contact-block" data-aos="fade-up">
                        <h5 class="footer-contact-block__header">
                            Email
                        </h5>
                        <p class="footer-contact-block__content">
                            <a href="mailto:joelkmuhoho@gmail.com">joelkmuhoho@gmail.com</a>
                        </p>
                    </div> <!-- end footer-contact-block -->
                    <br>
                    <div class="footer-contact-block" data-aos="fade-up">
                        <h5 class="footer-contact-block__header">
                            Social
                        </h5>
                        <ul class="footer-contact-block__list">
                            <li><a href="#0">Facebook</a></li>
                            <li><a href="#0">Instagram</a></li>
                            <li><a href="#0">X</a></li>
                        </ul>
                    </div> <!-- end footer-contact-block -->
                </div>
            </div>
        </div> <!-- end s-footer__main -->

        <div class="row s-footer__bottom">
            <div class="column large-full ss-copyright">
                <span>
                    © Copyright
                    <?php
                    $currentYear = date("Y");
                    echo $currentYear;
                    ?>
                </span>
                <span>Design by <a href="https://joelmuhoho.com">Joel Muhoho</a></span>
            </div> <!-- end ss-copyright -->

            <div class="ss-go-top">
                <a class="smoothscroll" title="Back to Top" href="#top">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                        <path d="M12 0l8 9h-6v15h-4v-15h-6z" />
                    </svg>
                </a>
            </div> <!-- end ss-go-top -->
        </div> <!-- end s-footer__bottom -->

    </footer> <!-- end s-footer -->


    <?php require("../includes/scripts.php"); ?>

</body>