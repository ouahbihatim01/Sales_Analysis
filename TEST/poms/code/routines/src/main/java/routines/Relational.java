// ============================================================================
//
// Copyright (c) 2006-2015, Talend SA
//
// Ce code source a �t� automatiquement g�n�r� par_Talend Open Studio for Big Data
// / Soumis � la Licence Apache, Version 2.0 (la "Licence") ;
// Votre utilisation de ce fichier doit �tre en accord avec les termes de la Licence.
// Vous pouvez obtenir une copie de la Licence sur
// http://www.apache.org/licenses/LICENSE-2.0
//
// Sauf lorsqu'explicitement pr�vu par la loi en vigueur ou accept� par �crit, le logiciel
// distribu� sous la Licence est distribu� "TEL QUEL", 
// SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
// Consultez la Licence pour conna�tre la terminologie sp�cifique r�gissant les autorisations et
// les limites pr�vues par la Licence.
//
// ============================================================================
package routines;

public class Relational {

    /**
     * Indicates when a variable is the null value.
     *
     * {talendTypes} boolean | Boolean
     *
     * {Category} Relational
     *
     * {param} Object(null)
     *
     * {example} ISNULL(null)
     *
     *
     */
    public static boolean ISNULL(Object variable) {
        return variable == null;
    }

    /**
     * Returns the complement of the logical value of an expression.
     *
     * {talendTypes} boolean | Boolean
     *
     * {Category} Relational
     *
     * {param} boolean(true)
     *
     * {example} NOT(false)
     */
    public static boolean NOT(boolean expression) {
        return !expression;
    }
    
    /**
     * Indicates when a variable is the null value.
     * 
     * @param value :the object need to judge.
     * 
     * @return 1 if value == null, 0 if not.
     * 
     * {Category} Relational
     * 
     * {param} Object(null)
     * 
     * {example} ISNULL(null)
     */
	public static int isNull(Object value) {
		if (value == null) {
			return 1;
		}
		return 0;

	}
}
