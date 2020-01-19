Puede ocurrir que Selenium quiera acceder a un elemento que todavia no se ha cargado, entonces el test falla.

Se pueden manejar las esperas. Hay explicitas e implicitas.

Selenium recomienda un tipo de espera. No combinados.

#Implicit waits: 
si el elemento no se encuentra de forma inmediata, le decimos que espere un cierto tiempo. Al terminar este tiempo, WebDriver hace una segunda consulta. Si este aun no ha cargado se lanza un "NoSuchElementException".
El tiempo por default es 0. No es la mas recomendada.

#Explicit waits: 
Un ejemplo es Thread.sleep(2000), pero no se recomienda usarlo.
Se usan las WebDriverWait y las ExpectedConditions. Estas realizan consultas cada 500mS. 

Fluent Waits: Permite establecer tiempo de espera.