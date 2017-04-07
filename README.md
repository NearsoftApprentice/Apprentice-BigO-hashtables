# Apprentice-BigO-sets-hashtables

## Ejercicio HashTable: 
Caché es un mecanismo en el cual se almacenan los objetos recientemente usados para que en futuras peticiones la búsqueda tenga un menor costo.
Deseamos implementar un caché con una HashTable en java.
Los requerimientos son: 
1. **Tamaño fijo:** El caché necesita tener límites de uso de memoria. En este caso será de 10.
2. **Acceso rápido:** La inserción y la operación de búsqueda necesita ser lo más cercano a O(1).
3. **El algoritmo de reemplazo:** Cuando el caché esté lleno, el elemento menos útil sera eliminado del caché. Utilizaremos LRU ( Least Recently Used), es decir los elementos que no han sido  accedidos recientemente serán eliminados.
4. **Los elementos:** Personas con email (id, nombre, edad, email)
5. **Entradas:** Archivo 1 CSV con 100 personas.  Archivo 2 con 500 números aleatorios del  0 al 99.
6. **Salida:** Número de elementos eliminados del caché.