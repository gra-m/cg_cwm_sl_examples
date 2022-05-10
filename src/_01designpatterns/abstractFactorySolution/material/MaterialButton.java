package abstractFactorySolution.material;

import abstractFactorySolution.Button;

public class MaterialButton implements Button {
@Override
public void render() {
	System.out.println("Material Button");
}
}
