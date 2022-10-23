import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
 * Leitura dos dados das outras classes
 */
public class App {
    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException {
        Class clazz = Tabela.class;
        System.out.println(clazz);
        System.out.println("\n***** Declaração do Imposto de Renda *****");
        Tabela tabela;
        Mes mes = new Mes();
        Salario salario = new Salario();
        IR ir = new IR();

        for (Method method : mes.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Tabela.class)) {
                method.invoke(mes);
            }
        }
        for (Method method : salario.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Tabela.class)) {
                method.invoke(salario);
            }
        }
        for (Method method : ir.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Tabela.class)) {
                method.invoke(ir);
            }
        }
    }
}
