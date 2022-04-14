package BuilderC�digoJunto;

import Builder.Cozinha;
import Builder.FishBuilder;
import Builder.HamburguerBuilder;
import Builder.SanduicheBuilder;

public class MinhaAplica��o 
{
		public static void main(String[] args) {
			Cozinha cozinha = new Cozinha();
			
			//Builders
			SanduicheBuilder b1 = new HamburguerBuilder();
			SanduicheBuilder b2 = new FishBuilder();
			
			cozinha.fazSanduiche(b2);
			b2.getSanduiche();
       }
    }
