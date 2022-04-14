package BuilderCódigoJunto;


public class Cozinha1 
{
	
	public abstract class SanduicheBuilder 
	{
	      public abstract void abrePao();
	      public abstract void insereIngredientes();
	      public abstract void fechaPao();
	      public abstract Sanduiche getSanduiche();
	}
	
	public void fazSanduiche(SanduicheBuilder builder) 
	{
		builder.abrePao();
		builder.insereIngredientes();
		builder.fechaPao();
	}
	
	
public abstract class Sanduiche 
{

public class Fishburguer extends Sanduiche
{
		public abstract class FishBuilder extends SanduicheBuilder 
        {

			private Sanduiche s = new Fishburguer();
				
				public void abrePao() {
					System.out.println("Abre pão de fishburguer");
				}
				
				public void insereIngredientes() {
					System.out.println("Insere filé de peixe");
				}
				
				public void fechaPao() {
					System.out.println("Fecha pão de fishburguer");
				}
				
				public Sanduiche getSanduiche() {
					System.out.println("Fishburguer está pronto");
					return s;
				}
		    }
	
public class Hamburguer extends Sanduiche 
{
		public abstract class HamburguerBuilder extends SanduicheBuilder {

			private Sanduiche s = new Hamburguer();
				
				public void abrePao() {
					System.out.println("Abre pão de hamburguer");
				}
				
				public void insereIngredientes() {
					System.out.println("Insere carne e queijo");
				}
				
				public void fechaPao() {
					System.out.println("Fecha pão de hamburguer");
				}
				
				public Sanduiche getSanduiche() {
					System.out.println("Hamburguer está pronto");
					return s;
				}
			}	
		 }
      }
   }
}
