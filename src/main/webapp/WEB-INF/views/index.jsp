<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">

    <!-- Bootstrap core CSS -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">

    <!-- Additional CSS Files -->
    <link rel="stylesheet" href="../../css/fontawesome.css">
    <link rel="stylesheet" href="../../css/templatemo-plot-listing.css">
    <link rel="stylesheet" href="../../css/animated.css">
    <link rel="stylesheet" href="../../css/owl.css">

  </head>

<body>

  <!-- ***** Preloader Start ***** -->
  <div id="js-preloader" class="js-preloader">
    <div class="preloader-inner">
      <span class="dot"></span>
      <div class="dots">
        <span></span>
        <span></span>
        <span></span>
      </div>
    </div>
  </div>
  <!-- ***** Preloader End ***** -->

  <!-- ***** Header Area Start ***** -->
  <header class="header-area header-sticky wow slideInDown" data-wow-duration="0.75s" data-wow-delay="0s">
    <div class="container">
      <div class="row">
        <div class="col-12">
          <nav class="main-nav">
            <!-- ***** Logo Start ***** -->
            <a href="index.html" class="logo">
            </a>
            <!-- ***** Logo End ***** -->
          </nav>
        </div>
      </div>
    </div>
  </header>
  <!-- ***** Header Area End ***** -->
  <div class="main-banner">
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          <div class="top-text header-text">
            <h2>Enter url to convert</h2>
          </div>
        </div>
        <div class="col-lg-12">
          <form id="search-form" name="gs" method="post" role="search" action="">
            <form action="#" th:action="/" method="post"/>
            <div class="row">
              <div class="col-lg-11 align-self-center">
                  <fieldset>
                      <input type="text" th:name="originUrl" class="searchText" placeholder="Shorten your link" autocomplete="on" required>
                  </fieldset>
              </div>
              <div class="col-lg-1">
                  <fieldset>
                      <button type="submit" class="main-button">Trans</button>
                  </fieldset>
              </div>
            </div>
          </form>
        </div>
      </div>

      <br>

      <div class="col-lg-12">
        <form id="search-form" name="gs" method="" role="search" action="#">
          <div class="row">
            <div class="col-lg-11 align-self-center">
              <output name="address" class="searchText">
                <p th:text="${shortUrl}"/>
              </output>
            </div>
            <div class="col-lg-1">
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>

  <!-- Scripts -->
  <script src="../../js/jquery.min.js"></script>
  <script src="../../js/bootstrap.bundle.min.js"></script>
  <script src="../../js/owl-carousel.js"></script>
  <script src="../../js/animation.js"></script>
  <script src="../../js/imagesloaded.js"></script>
  <script src="../../js/custom.js"></script>

</body>

</html>
