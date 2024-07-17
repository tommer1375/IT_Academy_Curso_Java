************************************************************************************************************
Sistema de Gestión para "El Corte Irlandes"
*************************************************************************************************************
—--------------------------------
Descripción del Problema
------------------------------------
Se solicita desarrollar un sistema de gestión para una franquicia del Corte Irlandes que permita:
- Manejar diferentes tipos de categoría de productos; Ropa, Electrodomésticos, Componentes
electrónicos y Belleza.
Todos ellos con características comunes:
● Código producto propio(autoincremental)
● Nombre
● Marca
● Precio
● Cantidad de stock
● Fecha de compra
● % de Rebaja
Y específicas:
● Ropa:
○ Talla
○ Tipo Tejido
○ Tipo de prenda
● Electrodomésticos:
○ Consumo energético
○ Fecha fabricación
○ Capacidad (capacidad de carga en lavadoras...)
○ Garantía de 18 meses.
● Componentes electrónicos:
○ Resolución de imagen
○ Capacidad batería (2500mAh, 3000mAh, 4000mAh).
○ Garantía de 9 meses.
● Belleza:
○ Veganos
○ Temporada de uso (primavera,verano etc..)
La aplicación cuenta con este menú:
1. - Crear un producto
2. - Listar productos ordenados de menor a mayor precio
3. - Eliminar producto
4. - Calcular fecha vencimiento de la garantía (**)
5. - Aplicar rebajas a productos
6. - Productos en rebajas
7. - Consultar stock de un producto
8. - Aumentar stock de un producto
9. - Quitar stock de un producto
(**) Dada la fecha de compra del producto y la duración de la garantía se debe calcular la fecha
de vencimiento.
La aplicación deberá ser capaz de manejar situaciones inesperadas. Algunos ejemplos:
● Eliminar productos que no existen
● Informar cuando un producto no tiene stock
● Calcular garantía de un producto que no tiene
