
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Clínica Médica - Agendamentos</title>
        
        <link rel="shortcut icon" href="../img/logo1.png" >
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css" rel="stylesheet">

        <!-- Add custom CSS here -->
        <link href="css/sb-admin.css" rel="stylesheet">
        <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    </head>

    <body>

        <div id="wrapper">

            <!-- Sidebar -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">Clínica Médica</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        <li><a href="index.jsp"><i class="fa fa-dashboard"></i> Inicio</a></li>
                        <li><a href="funcionarioAdm.jsp"><i class="fa fa-edit"></i> Funcionários</a></li>
                        <li><a href="pacienteAdm.jsp"><i class="fa fa-edit"></i> Pacientes</a></li>
                        <li class="active"><a href="agendamentoAdm.jsp"><i class="fa fa-edit"></i> Agendamentos</a></li>
                        <li><a href="agendaAdm.jsp"><i class="fa fa-edit"></i> Agenda Médica</a></li>
                    </ul>

                    <!-- Mensagens-->
                    <ul class="nav navbar-nav navbar-right navbar-user">

                        <li class="dropdown user-dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><i class="fa fa-user"></i> Perfil</a></li>
                                <li><a href="#"><i class="fa fa-envelope"></i> Inbox</a></li>
                                <li><a href="#"><i class="fa fa-gear"></i> Settings</a></li>
                                <li class="divider"></li>
                                <li><a href="#"><i class="fa fa-power-off"></i> Sair</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </nav>

            <div id="page-wrapper">

                <div class="row">
                    <div class="col-lg-12">
                        <h1>Agendamentos</h1>
                        <ol class="breadcrumb">
                            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> Inicio</a></li>
                            <li class="active"><i class="fa fa-edit"></i> Agendamentos</li>
                        </ol>

                    </div>
                </div><!-- /.row -->

                <div class="row">
                    <div class="col-lg-6"> <!--12-->
                        <h2>Agendamento</h2>

                       
                        <form method="get" action="">
                            <div class="form-group">
                                
                                <label>Buscar Paciente:
                                    <input name="cep" type="text" id="cep" value="" size="10" maxlength="11" class="form-control" /></label>
                                <button type="submit" class="btn btn-default>"><i class="fa fa-search"></i> Buscar</button><br />
                                <p class="help-block">Informe o CPF</p>
                                
                                 <label>Nome Completo:
                                    <input name="nomePaciente" type="text" id="nomePaciente" size="25" maxlength="150" class="form-control"/></label>
                                <label>CPF:
                                    <input name="cpf" type="text" id="cpf" size="25"  maxlength="11" class="form-control"/></label><br />
                               
                            </div>

                            <div class="form-group" >
                                <label>Especialidade</label>
                                <select class="form-control">
                                    <option>Selecione</option>
                                    <option>Ortopedia</option>
                                    <option>Oftalmologia</option>
                                    <option>Ginecologia</option>
                                    <option>Geriatria</option>
                                    <option>Cardiologia</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label>Médico</label>
                                <select class="form-control">
                                    <option>Selecione</option>
                                    <option>Maria</option>
                                    <option>José</option>
                                    <option>Bruna</option>
                                    <option>Ana</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label>Data Agendamento</label>
                                <select class="form-control">
                                    <option>Selecione</option>
                                    <option>19/10/2018</option>
                                    <option>20/10/2018</option>
                                    <option>21/10/2018</option>
                                    <option>22/10/2018</option>

                                </select>
                            </div>
                                <div class="form-group" >
                                    <label>Horário</label>
                                    <select class="form-control">
                                        <option>Selecione</option>
                                        <option>12:00</option>
                                        <option>12:30</option>
                                        <option>13:00</option>
                                        <option>13:30</option>

                                    </select>
                                </div>
                        </form>

                        <div  class="form-action">
                            <button type="submit" class="btn btn-default">Salvar</button>
                        </div>
                    </div>
                    <!---------------------------------->
                    <div class="col-lg-6"> <!--12-->
                        <h3>Agendamentos</h3>
                        <form method="get" action="">
                            <div class="form-group">
                                <label>Consulta por Paciente:
                                    <input name="cpfBusca" type="text" id="cpfBusca" value="" size="10" maxlength="11" class="form-control" /></label>
                                <button type="submit" class="btn btn-default>"><i class="fa fa-search"></i> Buscar</button><br />

                                <h4>Agendas</h4>

                                <div class="table-responsive">
                                    <table class="table table-hover table-striped tablesorter">
                                        <thead>
                                            <tr>
                                                <th>Paciente</th>
                                                <th>Médico</th>
                                                <th>Especialidade</th>
                                                <th>Data</th>
                                                <th>Horário</th>
                                                
                                                <th>Ação</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>João</td>
                                                <td>João</td>
                                                <td>1265</td>
                                                <td>12345</td>
                                                <td>47214587</td>
                                               
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>João</td>
                                                <td>Maria</td>
                                                <td>2614568</td>
                                                <td>333333</td>
                                                <td>987462</td>
                                                
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>João</td>
                                                <td>João</td>
                                                <td>1265</td>
                                                <td>12345</td>
                                                <td>47214587</td>
                                                
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>João</td>
                                                <td>Maria</td>
                                                <td>2614568</td>
                                                <td>333333</td>
                                                <td>987462</td>
                                               
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>João</td>
                                                <td>João</td>
                                                <td>1265</td>
                                                <td>12345</td>
                                                <td>47214587</td>
                                                
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>João</td>
                                                <td>Maria</td>
                                                <td>2614568</td>
                                                <td>333333</td>
                                                <td>987462</td>
                                                
                                                <td>
                                                    <button>Excluir</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>João</td>
                                                <td>João</td>
                                                <td>1265</td>
                                                <td>12345</td>
                                                <td>47214587</td>
                                                
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
                    
                </div><!-- /.row -->
            </div><!-- /#page-wrapper -->
        </div><!-- /#wrapper -->

        <!-- JavaScript -->
        <script src="js/jquery-1.10.2.js"></script>
        <script src="js/bootstrap.js"></script>

    </body>
</html>
