package
edu.escuelaing.arem.ASE.app;
import static spark.Spark.*;
public class SparkWebApp {
    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\"\n" +
                "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1 style=\"color:#001f3f\">AREP-SPARK LAB 2</h1>\n" +
                "\n" +
                "    <table>\n" +
                "        <tr>\n" +
                "            <td>Column 1</td>\n" +
                "            <td>Column 2</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>Estimate Proxy Size</td>\n" +
                "            <td>Development Hours</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>160</td>\n" +
                "            <td>15.0</td>\n" +
                "        </tr>\n" +
                "\n" +
                "        <tr>\n" +
                "            <td>591</td>\n" +
                "            <td>69.9</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>114</td>\n" +
                "            <td>6.5</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>229</td>\n" +
                "            <td>22.4</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>230</td>\n" +
                "            <td>28.4</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>270</td>\n" +
                "            <td>65.9</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>128</td>\n" +
                "            <td>19.4</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>1657</td>\n" +
                "            <td>198.7</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>624</td>\n" +
                "            <td>38.8</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>1503</td>\n" +
                "            <td>138.2</td>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "    <form>\n" +
                "\n" +
                "\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>");
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4000; //returns default port if heroku-port isn't set

    }
}