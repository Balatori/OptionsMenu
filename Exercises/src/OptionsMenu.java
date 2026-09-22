import java.util.Scanner;

public class OptionsMenu {
    public static void main(String[] args) {


// Scanner
        Scanner scanner = new Scanner(System.in); // Scanner

// Cadastro
        System.out.println("Log on");
        System.out.print("New profile: ");
        String perfilC = scanner.nextLine(); // variavel perfilCadastro


        /* É um sistema que limita a quantidade de caracteres do pefil no cadastro pra no minimo 3 caracteres e no maximo 4,
          se o valor for menor que 3 ou maior que 15 ele vai repetir o sistema de erro enquanto
          eu não acertar a quantidade de caracteres pré-definida */
        while (perfilC.length() < 3 || perfilC.length() > 15) {
            System.out.println("Your profile needs to have between 3-15 characters "); // Mensagem de erro
            System.out.print("New profile: ");
            perfilC = scanner.nextLine(); // Repete o scanner deixando eu digitar novamente
        } // chave que fecha o sistema de caracteres de cadastro (Perfil) do while


        System.out.print("New password: ");
        String senhaC = scanner.nextLine(); // variavel senhaCadastro

        /* É um sistema que limita a quantidade de caracteres da senha no cadastro pra no minimo 5 caracteres e no maximo 17,
          se o valor for menor que 3 ou maior que 15 ele vai repetir o sistema de erro enquanto
          eu não acertar a quantidade de caracteres pré-definida */
        while (senhaC.length() < 5 || senhaC.length() > 17) {
            System.out.println("Your password needs to have between 5-17 characters ");
            System.out.print("New password: ");
            senhaC = scanner.nextLine();
        } // chave que fecha o sistema de caracteres de cadastro (senha) do while


        // "\n" faz pular a linha e .repeat:1000 repete a mensagem 1000 vezes, isso serve com uma tentativa de limpar o chat
        System.out.println("\n".repeat(1000));

        int logout = 0; // int que será alterado depois mais que não pode ser igual a 2

        /* sistema de while GIGANTESCO que cobre o codigo inteiro pro sistema de logout, basicamente ele deixa rodando infinitamente,
          o true faz a condição sempre ser verdadeira, ou seja ele vai rodar infinitamente pra sempre até que a pessoa pare o terminal com return,
          ele serve pra pessoa voltar ao login, após sair da conta (logout)*/
        while (true) {


            int tentativas = 3; // Declara quantidade de tentativas
            while (tentativas > 0) { // O while repete toda parte de login até tentativas ser = 0 ou sls e pls serem iguais a scs e pcs



                System.out.println("Login");
                System.out.print("Your Profile: ");
                String perfilL = scanner.nextLine();

                // Mesmo sistema de caracteres mostado anteriormente
                while (perfilL.length() < 3 || perfilL.length() > 15) {
                    System.out.println("Your profile needs to have between 3-15 characters ");
                    System.out.print("Your Profile: ");
                    perfilL = scanner.nextLine();
                } // chave que fecha o sistema de caracteres de login (Perfil) do while


                System.out.print("Type your password: ");
                String senhaL = scanner.nextLine();

                // Mesmo sistema de caracteres mostado anteriormente
                while (senhaL.length() < 5 || senhaL.length() > 17) {
                    System.out.println("Your password needs to have between 5-17 characters ");
                    System.out.print("Your Password: ");
                    senhaL = scanner.nextLine();
                } // chave que fecha o sistema de caracteres de login (Senha) do while


                /* Ifs (estrutura de tentativas e login confrimado) Ele basicamente compara se o perfil e senha
                inseridos no login batem com os do cadastro, se for true, as infroamçoes batem e para o sistema de ifs */
                if (perfilL.equals(perfilC) && senhaL.equals(senhaC)) { // .equals funciona pra comparar strings
                    System.out.println("\n".repeat(1000));
                    break; // Para os ifs se as informaçoes serem inseridas corretamente


                    /* Basicamente ele faz com que se o valor NÃO for true, ele diminui suas tentativas,
                    * ou seja, se o valor for false ele diminui suas tentativas em 1 */
                } else { // ou poderia usar: if (!perfilL.equals(perfilC) || !senhaL.equals(senhaC))
                    tentativas--;// Diminui a quantidade de tentativas
                    System.out.println("\n".repeat(1000)); // "\n" faz pular a linha e .repeat:1000 repete a mensagem 1000 vezes
                    System.out.println("You typed the wrong informations❌");
                    System.out.println("Tries left: " + tentativas);
                } // chave que fecha o else


            } // Chave que fecha o grande sistema de tentativas do while

            if (tentativas == 0) {
                System.out.println("You have no tries left❌");
                return; // Para o codigo se as tentativas acabarem
            } // chave que fecha o if de tentativas

            int selectMenu = 0; // valor que não pode ser = 4

            /* Sistema de while GIGANTE que abrange quase o codigo do menu inteiro pra que o menu se repita toda hora
              que você fecha um submenu com o "voltar" */
            while (selectMenu != 4) {
                System.out.println("You're logged as " + perfilC);
                System.out.println("-----------------------------------------");
                System.out.println("Options Menu");

                System.out.println("1 - Profile");

                System.out.println("2 - Change Informations");

                System.out.println("3 - Logout");

                System.out.println("4 - Exit");

                System.out.print("Insert: ");
                selectMenu = scanner.nextInt(); /* Uma variante que le as informaçoes acima e depois se selecionar uma delas,
                                              ele lê a selecionada e cada menu verifica se a variavel dele é selecionada */

                /* Sistema de while que confere se você digita um valor errado e repete enquanto esse valor não for um dos 4 */
                while (selectMenu < 1 || selectMenu > 4) {
                    System.out.print("Invalid number, type again: ");
                    selectMenu = scanner.nextInt();
                } // Fecha o bloco de numeros invalidos

                switch (selectMenu) { // Switch grande pra cada menu, o numero dele é igual a tecla do menu
                    case 1: // Submenu de perfil e senha
                        System.out.println("Profile And Privacy");
                        System.out.println("-----------------------------------");
                        System.out.println("Profile: " + perfilC); // Mostra o seu usuario
                        System.out.println("Password: " + senhaC); // Mostra a sua senha
                        System.out.println("Type 1 to go back");
                        int voltar = 0; // int pro sistema de voltar ou selecionar

                        System.out.print("Insert: ");
                        voltar = scanner.nextInt();

                        while (voltar != 1) {
                            System.out.print("Invalid number, type again: ");
                            voltar = scanner.nextInt(); // Se for diferente de 1 ele repete até acertar o valor
                        } // fecha o sistema de voltar do submenu 1



                        break; // Fecha o submenu e repete o menu caso as condições sejam atendidas

                    case 2: // Submenu de alterar infomações
                        System.out.println("Type 1 to change Profile username");
                        System.out.println("Type 2 to change Password");
                        System.out.println("Type 3 to go back");
                        int newProfilePassword = 0; // Int pro sistema de alterar usuario e senha

                        System.out.print("Insert: ");
                        newProfilePassword = scanner.nextInt();

                        /* Sistema de while para verificar se o numero é invalido e repetir até que ele não seja */
                        while (newProfilePassword < 1 || newProfilePassword > 3) {
                            System.out.print("Invalid number, type again: ");
                            newProfilePassword = scanner.nextInt();

                        } // Fecha o bloco que confirma se o numero é invalido


                        /* Sistema de while para repetir as opçoes após 1 delas serem alteradas,
                         repete enquanto o numero digitado for diferente de 3 (3 é o numero pra voltar */
                        while (newProfilePassword != 3) {
                            switch (newProfilePassword) { // Switch dentro do switch pra mudar senha e perfil
                                case 1: // Muda a variavel perfilC (usuario cadastrado)
                                    System.out.println("Changing profile username");
                                    System.out.println("\n");

                                    System.out.print("New User: ");
                                    scanner.nextLine(); // Limpa o enter
                                    perfilC = scanner.nextLine(); // O usuario digitado aqui ira alterar a variavel perfilC (usario cadastrado)
                                    // While com sistema de caracteres
                                    while (perfilC.length() < 3 || perfilC.length() > 15) {
                                        System.out.println("Your profile needs to have between 3-15 characters ");
                                        System.out.print("New profile: ");
                                        perfilC = scanner.nextLine();
                                    } // Fecha o bloco do while de caracteres

                                    System.out.println("Your username was changed successfully"); // Confirma que o usuario foi alterado

                                    System.out.println("\n");
                                    System.out.println("Type 1 to change Profile username");
                                    System.out.println("Type 2 to change Password");
                                    System.out.println("Type 3 to go back");

                                    System.out.print("Insert: ");
                                    newProfilePassword = scanner.nextInt(); // Variavel que vai de 1 a 3 pra seleiconar opções

                                    // While que repete se por um numero invalido
                                    while (newProfilePassword < 1 || newProfilePassword > 3) {
                                        System.out.print("Invalid number, Type again: ");
                                        newProfilePassword = scanner.nextInt();
                                    } // Fecha o bloco do while de confirmação de numeros invalidos

                                    break; /* Basicamente o 3 é o numero de voltar no menu, o 3 não esta atribuido a nada,
                                    então quando digita 3 o codigo para, assim voltando pro loop de repetição do while no menu */

                                case 2: // Sistema de alterar senha

                                    System.out.println("Changing Password");
                                    System.out.println("\n");

                                    System.out.print("New Password: ");
                                    scanner.nextLine();
                                    senhaC = scanner.nextLine(); // A senha digitada aqui, atualiza a senha do cadastro, assim alterando-a

                                    //Sistema de while que verifica se a senha tem os caracteres necessarios
                                    while (senhaC.length() < 5 || senhaC.length() > 17) { /* Se a senha for menor que 5 ou maior que 17,
                                     aparece uma mensagem de erro e repete o loop */
                                        System.out.println("Your password needs to have between 5-17 characters "); // Confirma que a senha foi alterada
                                        System.out.print("New password: ");
                                        senhaC = scanner.nextLine(); // A senha digitada aqui, atualiza a senha do cadastro, assim alterando-a
                                    } // Fecha o bloco de while que confirma a quantidade de caracteres

                                    System.out.println("Your password was successfully changed"); // Aviso de que a alteração foi concluida

                                    System.out.println("\n");
                                    System.out.println("Type 1 to change Profile username");
                                    System.out.println("Type 2 to change Password");
                                    System.out.println("Type 3 to go back");

                                    System.out.print("Insert: ");
                                    newProfilePassword = scanner.nextInt(); // Numero inserido aqui abrira a opção pre-definida

                                    /* Sistema de while que confere se o numero é invalido */
                                    while (newProfilePassword < 1 || newProfilePassword > 3) {
                                        System.out.print("Invalid number, Type again: ");
                                        newProfilePassword = scanner.nextInt();
                                    } // Fecha o sistema de while de confirmação

                                    break; // Fecha o bloco se clicar 3, logo não abrindo nenhum case e voltando ao menu

                            } // Fecha o switch do menu de alteração de senha

                        } // Fecha o while que repete até com que o numero seja diferente de 3


                                break; // Fecha o while quando ele acaba, assim voltando pro menu
                    case 3: // Sistema de lgout
                                    System.out.println("logout");
                                    System.out.println("\n");
                                    System.out.println("Type 1 to go back");
                                    System.out.println("Type 2 to confirm logout");

                                    System.out.print("Inseirir: ");
                                    logout = scanner.nextInt(); /* Caso o numero digitado seja 2, ele altera a variavel logout do while gigante la em cima
                                      assim repetindo o sistema de login inteiro, tem um if externo abaixo do case 4 que confere se o numero é igual a 2 e volta o loop */

                                    //While que confere se o numero não é invalido
                                    while (logout < 1 || logout > 2) {
                                        System.out.print("Invalid number, type again: ");
                                        logout = scanner.nextInt();
                                    } // Fecha o while de confirmação de numero invalido

                                    break; // Fecha o loop se ele não for invalido


                    case 4: // Case da opção exit
                                    return; // Fecha o terminal
                } // Fecha o switch de opçoes do menu
                            if (logout == 2) { // Se logout for igual a 2 ele volta pra parte de login
                                break;
                            } // Fecha o if de logout
            } // Fecha o sistema de tentativas que fica dentro do de logout (isso serve pra poder errar após o logout)
            scanner.nextLine();
        } // Fecha o while de logout que começa dês do login


    }
}
