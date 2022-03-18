
public class Relogio {
private int hora, minuto, segundo;

public Relogio(int hora, int minuto, int segundo) {
setHora(hora);;
setMinuto(minuto);
setSegundo(segundo);
} // fim do construtor padrão

public void setHora(int novaHora) {
if(novaHora >= 0 && novaHora < 24) {
hora = novaHora;
} // fim da condicional if
} // fim do método setHora

public void setMinuto(int novoMinuto) {
if(novoMinuto >= 0 && novoMinuto < 60) {
minuto = novoMinuto;
} // fim da condicional if
} // fim do método setMinuto

public void setSegundo(int novoSegundo) {
if(novoSegundo >= 0 && novoSegundo < 60) {
segundo = novoSegundo;
} // fim da condicional if
} // fim do método setSegundo

public String mostrarHoraAtual() {
return ("São " + hora + " horas " + minuto + " minutos " + segundo + " segundos.");
} // fim do método método mostrarHoraAtual

} // fim da classe
