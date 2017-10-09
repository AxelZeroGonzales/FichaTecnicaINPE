
package inpe.ficha.service;

import java.util.List;

public interface Combo<T> {
      List<T> readAll() throws Exception;
}
