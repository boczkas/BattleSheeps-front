package pl.js.sheep.models;

import org.springframework.stereotype.Service;
import pl.js.sheep.dto.Shoot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShootList {

  private List<Shoot> shoots = new ArrayList<>();

  public void addShoot(Shoot shoot) {
    shoots.add(shoot);
  }

  @Override
  public String toString() {
   return Arrays.deepToString(shoots.toArray());
  }
}
