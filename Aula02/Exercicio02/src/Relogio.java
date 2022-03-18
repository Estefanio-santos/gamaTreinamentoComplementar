
public class Relogio {

private int hora, minuto, segundo;

public Relogio(int hora, int minuto, int segundo) {

this.hora = hora;
this.minuto = minuto;
this.segundo = segundo;
this.setHora(hora);
this.setMinuto(minuto);
this.setSegundo(segundo);

} // fim do construtor padr�o

public void setHora(int novaHora) {
if(novaHora >= 0 && novaHora <= 23) {
hora = novaHora;
} // fim da condicional if
} // fim do m�todo setHora

public void setMinuto(int novoMinuto) {
if(novoMinuto >= 0 && novoMinuto < 60) {
minuto = novoMinuto;
} // fim da condicional if
} // fim do m�todo setMinuto

public void setSegundo(int novoSegundo) {
if(novoSegundo >= 0 && novoSegundo < 60) {
segundo = novoSegundo;
} // fim da condicional if
} // fim do m�todo setSegundo

public int mostrarHoraAtual() {
return (hora + minuto + segundo);
} // fim do m�todo m�todo mostrarHoraAtual

} // fim da classe
