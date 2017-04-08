import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheHash<K, V> extends LinkedHashMap<K, V> {

  private static final long serialVersionUID = 1L;
    private int cacheSize;
    private int borrados;

  public LRUCacheHash(int cacheSize) {
    super(16, 0.75f, true);
    this.cacheSize = cacheSize;
  }

  protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
    for(Map.Entry<K, V> entrada : this.entrySet()){
      System.out.print(entrada.getKey()+"|");
    }
    System.out.print("\n<-");
    boolean borrado = size() >= cacheSize;
    if (borrado){
      borrados++;
      System.out.println("llave:"+eldest.getKey()+" valor:"+eldest.getValue()+" - "+ borrados);
    }
    return borrado;
  }

  public int getBorrados(){return borrados;}

}