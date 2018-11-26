<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Clínica Médica</title>
        <meta name="description" content="Clínica Médica">
        <meta name="keywords" content="Clínica Médica,Médico,Clínicas,Saúde,Consultas Médicas">

        <link rel="shortcut icon" href="img/logo1.png" >
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Candal">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>

    <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
        <!--banner-->
        <section id="banner" class="banner">
            <div class="bg-color"> 
                <nav class="navbar navbar-default navbar-fixed-top">
                    <div class="container">
                        <div class="col-md-12">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                                <a class="navbar-brand" href="#"><img src="img/logo11.png" class="img-responsive" style="width: 140px; margin-top: -53px;"></a>
                            </div>
                            <div class="collapse navbar-collapse navbar-right" id="myNavbar">
                                <ul class="nav navbar-nav">
                                    <li class="active"><a href="#banner">Inicio</a></li>
                                    <li class=""><a href="#service">Serviços</a></li>
                                    <li class=""><a href="#service1">Meus Agendamentos</a></li>

                                    <li class=""><a href="#service2">Pré Agendamento</a></li>
                                    <li class=""><a href="index.html">Sair</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </nav>
                <div class="container">
                    <div class="row">
                        <div class="banner-info">
                            <div class="banner-logo text-center">
                                <img src="img/logo11.png" class="img-responsive">
                            </div>
                            <div class="banner-text text-center">
                                <h1 class="white">Agende sua consulta agora mesmo!!</h1>
                                <p>Médicos e especialistas prontos para <br> o melhor atendimento possível.</p>
                                <a href="#contact" class="btn btn-appoint">Agende aqui.</a>
                            </div>
                            <div class="overlay-detail text-center">
                                <a href="#service"><i class="fa fa-angle-down"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--/ banner-->
        <!--service-->
        <section id="service" class="section-padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-sm-4">
                        <h2 class="ser-title">Nossos Serviços</h2>
                        <hr class="botm-line">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris cillum.</p>
                    </div>
                    <div class="col-md-4 col-sm-4">
                        <div class="service-info">
                            <div class="icon">
                                <i class="fa fa-stethoscope"></i>
                            </div>
                            <div class="icon-info">
                                <h4>24 Hour Support</h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                            </div>
                        </div>
                        <div class="service-info">
                            <div class="icon">
                                <i class="fa fa-ambulance"></i>
                            </div>
                            <div class="icon-info">
                                <h4>Emergency Services</h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4">
                        <div class="service-info">
                            <div class="icon">
                                <i class="fa fa-user-md"></i>
                            </div>
                            <div class="icon-info">
                                <h4>Medical Counseling</h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                            </div>
                        </div>
                        <div class="service-info">
                            <div class="icon">
                                <i class="fa fa-medkit"></i>
                            </div>
                            <div class="icon-info">
                                <h4>Premium Healthcare</h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--/ service-->

        <!-- teste-->
        <section id="service1" class="section-padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-sm-4">
                        <h2 class="ser-title">Meus Agendamentos</h2>
                        <hr class="botm-line">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris cillum.</p>
                    </div>
                    <div class="col-md-8 col-sm-8">

                        <form method="get" action="">
                            <div class="form-group col-md-12 col-sm-12">
                                <label>Buscar por Data:
                                    <input name="cpfBusca" type="text" id="cpfBusca" value="" size="10" maxlength="11" class="form-control" /></label>
                                <button type="submit" class="btn btn-default>"><i class="fa fa-search"></i> Buscar</button><br />

                                <h4>Lista de Agendamentos</h4>

                                <div class="table-responsive">
                                    <table class="table table-hover table-striped tablesorter">
                                        <thead>
                                            <tr>
                                                <th>Data</th>
                                                <th>Hora</th>
                                                <th>Especialidade</th>
                                                <th>Médico</th>
                                                <th>Ação</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>12/02/2018</td>
                                                <td>15:00</td>
                                                <td>Dermatologia</td>
                                                <td>João Silva</td>

                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>25/06/2018</td>
                                                <td>12:30</td>
                                                <td>Cardiologia</td>
                                                <td>Maria Santos</td>
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>12/02/2018</td>
                                                <td>15:00</td>
                                                <td>Dermatologia</td>
                                                <td>João Silva</td>
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>25/06/2018</td>
                                                <td>12:30</td>
                                                <td>Cardiologia</td>
                                                <td>Maria Santos</td>
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>12/02/2018</td>
                                                <td>15:00</td>
                                                <td>Dermatologia</td>
                                                <td>João Silva</td>
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>25/06/2018</td>
                                                <td>12:30</td>
                                                <td>Cardiologia</td>
                                                <td>Maria Santos</td>
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>12/02/2018</td>
                                                <td>15:00</td>
                                                <td>Dermatologia</td>
                                                <td>João Silva</td>
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </form>
                    </div>


                </div>
            </div>
        </section>
        <!-- Teste-->
        <!-- teste -->
        <section id="service2" class="section-padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-sm-4">
                        <h2 class="ser-title">Pré Agendamento</h2>
                        <hr class="botm-line">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris cillum.</p>
                    </div>
                    <div class="col-md-8 col-sm-8">

                        <form method="get" action="">

                            <div class="form-group col-md-6 col-sm-6">
                                <label>Especialidade</label>
                                <select class="form-control">
                                    <option>Ortopedia</option>
                                    <option>Oftalmologia</option>
                                    <option>Ginecologia</option>
                                    <option>Geriatria</option>
                                    <option>Cardiologia</option>
                                </select>
                            </div>
                            <div class="form-group col-md-6 col-sm-6">
                                <label>Médico</label>
                                <select class="form-control">
                                    <option>João</option>
                                    <option>Maria</option>
                                    <option>José</option>
                                    <option>Bruna</option>
                                    <option>Ana</option>
                                </select>
                            </div>
                            <div  class="form-action col-md-12 col-sm-12">
                                <button type="submit" class="btn btn-default">Salvar</button>
                            </div>
                        </form>


                    </div>

                </div>
            </div>
        </section>
        <!-- teste -->

        <!--footer-->
        <footer id="footer">
            <div class="top-footer">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4 col-sm-4 marb20">
                            <div class="ftr-tle">
                                <h4 class="white no-padding">Sobre nós</h4>
                            </div>
                            <div class="info-sec">
                                <p>Praesent convallis tortor et enim laoreet, vel consectetur purus latoque penatibus et dis parturient.</p>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-4 marb20">
                            <div class="ftr-tle">
                                <h4 class="white no-padding">Quick Links</h4>
                            </div>
                            <div class="info-sec">
                                <ul class="quick-info">
                                    <li><a href="index.html"><i class="fa fa-circle"></i>Inicio</a></li>
                                    <li><a href="#service"><i class="fa fa-circle"></i>Serviços</a></li>
                                    <li><a href="#contact"><i class="fa fa-circle"></i>Agendamento</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-4 marb20">
                            <div class="ftr-tle">
                                <h4 class="white no-padding">Redes sociais</h4>
                            </div>
                            <div class="info-sec">
                                <ul class="social-icon">
                                    <li class="bglight-blue"><i class="fa fa-facebook"></i></li>
                                    <li class="bgred"><i class="fa fa-google-plus"></i></li>
                                    <li class="bgdark-blue"><i class="fa fa-linkedin"></i></li>
                                    <li class="bglight-blue"><i class="fa fa-twitter"></i></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="footer-line">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 text-center">
                            © Copyright Clínica Médica. All Rights Reserved
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!--/ footer-->

        <script src="js/jquery.min.js"></script>
        <script src="js/jquery.easing.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/custom.js"></script>

    </body>

</html>
