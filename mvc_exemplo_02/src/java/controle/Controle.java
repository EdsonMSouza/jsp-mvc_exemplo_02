/*
 * Apenas para fins educacionais.
 * Citar a fonte em caso de uso para terceiros
 */
package controle;

import bean.Endereco;
import bean.Pessoa;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Edson Melo de Souza (prof.edson.melo@gmail.com)
 */
public class Controle extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

        /**
         * As linhas abaixo corrigem a acentuação e os caracteres especiais
         */
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        // variável para redirecionamento das páginas (erro e mensagem)
        String pagina = "";
        /**
         * Recebendo os dados do formulário e atribuindo as variáveis
         */
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String rua = request.getParameter("rua");
        String cep = request.getParameter("cep");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");

        /**
         * Verificando se os campos foram preenchidos e tratando o erro
         */
        try {
            if (nome.isEmpty()
                    || cpf.isEmpty()
                    || rua.isEmpty()
                    || rua.isEmpty()
                    || cep.isEmpty()
                    || bairro.isEmpty()
                    || cidade.isEmpty()
                    || estado.isEmpty()) {

                /**
                 * Lança uma exception personalizada para o erro
                 */
                throw new Exception("O preenchimento dos campos é obrigatório!");
            } else {
                /**
                 * Verifica se o número é um número mesmo
                 */
                try {
                    int numero = Integer.parseInt(request.getParameter("numero"));

                    /**
                     * Se o número for válido, cria a instância do objeto Pessoa
                     * e atribui os valores ao objeto
                     */
                    Pessoa p = new Pessoa();
                    p.setNome(nome);
                    p.setCpf(cpf);
                    p.setEndereco(new Endereco(rua, numero, cep, bairro, cidade, estado));

                    /**
                     * Se tudo deu certo, atribui o objeto ao atributo mensagem
                     */
                    request.setAttribute("mensagem", p);

                    /**
                     * Enviará para a página de saída (mensagem.jsp)
                     */
                    pagina = "mensagem.jsp";

                } catch (NullPointerException | NumberFormatException ex) {
                    /**
                     * Atribui uma mensagem de erro ao atributo mensagem
                     */
                    request.setAttribute("mensagem", "Um número era esperado!");

                    /**
                     * Enviará para a página de erro (erro.jsp)
                     */
                    pagina = "erro.jsp";
                }
            }
        } catch (Exception e) {
            /**
             * Se ocorreu um erro no preenchimento dos campos, gera o erro e
             * atribui ao atributo mensagem
             */
            request.setAttribute("mensagem", e.getMessage());

            /**
             * Enviará para a página de erro (erro.jsp)
             */
            pagina = "erro.jsp";
        }

        /**
         * Faz o redirecionamento para a página correta
         */
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
