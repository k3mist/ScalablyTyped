package typings
package samchonDashFrameworkLib.samchonDashFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "library")
@js.native
object libraryNs extends js.Object {
  @js.native
  class CartesianProduct protected ()
    extends samchonLib.samchonMod.libraryNs.CartesianProduct {
    /**
      * Initializer Constructor.
      *
      * @param digits Max number (size) of each digit.
      */
    def this(digits: scala.Double*) = this()
  }
  
  @js.native
  class Factorial protected ()
    extends samchonLib.samchonMod.libraryNs.Factorial {
    /**
      * Construct from factorial size N.
      *
      * @param n Factoria size N.
      */
    def this(n: scala.Double) = this()
  }
  
  @js.native
  class Permutation protected ()
    extends samchonLib.samchonMod.libraryNs.Permutation {
    /**
      * Construct from size of N and R.
      *
      * @param n Size of candidates.
      * @param r Size of elements of each case.
      */
    def this(n: scala.Double, r: scala.Double) = this()
  }
  
  @js.native
  class RepeatedPermutation protected ()
    extends samchonLib.samchonMod.libraryNs.RepeatedPermutation {
    /**
      * Construct from size of N and R.
      *
      * @param n Size of candidates.
      * @param r Size of elements of each case.
      */
    def this(n: scala.Double, r: scala.Double) = this()
  }
  
  @js.native
  class StringUtil ()
    extends samchonLib.samchonMod.libraryNs.StringUtil
  
  /**
    * URLVariables class is for representing variables of HTTP.
    *
    * {@link URLVariables} class allows you to transfer variables between an application and server.
    *
    * When transfering, {@link URLVariables} will be converted to a *URI* string.
    * - URI: Uniform Resource Identifier
    *
    * @reference http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/flash/net/URLVariables.html
    * @author Migrated by Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * Default Constructor.
    */
  class URLVariables ()
    extends samchonLib.samchonMod.libraryNs.URLVariables {
    /**
      * Construct from a URL-encoded string.
      *
      * The {@link decode decode()} method is automatically called to convert the string to properties of the {@link URLVariables} object.
      *
      * @param str A URL-encoded string containing name/value pairs.
      */
    def this(str: java.lang.String) = this()
  }
  
  @js.native
  class XML ()
    extends samchonLib.samchonMod.libraryNs.XML {
    def this(str: java.lang.String) = this()
    def this(xml: sxmlLib.libXMLMod.XML) = this()
  }
  
  @js.native
  class XMLList ()
    extends samchonLib.samchonMod.libraryNs.XMLList
  
  /* static members */
  @js.native
  object StringUtil extends js.Object {
    /**
      * An array containing whitespaces.
      */
    var SPACE_ARRAY: js.Any = js.native
    /**
      * @hidden
      */
    var _Fetch_substitute_index: js.Any = js.native
    /**
      * @hidden
      */
    var _Substitute_sql_string: js.Any = js.native
    /**
      * Generate a substring.
      *
      * Extracts a substring consisting of the characters from specified start to end.
      * It's same with str.substring( ? = (str.find(start) + start.size()), str.find(end, ?) )
      *
      * ```typescript
      * let str: string = StringUtil.between("ABCD(EFGH)IJK", "(", ")");
      * console.log(str); // PRINTS "EFGH"
      * ```
      *
      * - If start is not specified, extracts from begin of the string to end. </li>
      * - If end is not specified, extracts from start to end of the string. </li>
      * - If start and end are all omitted, returns str, itself. </li>
      *
      * @param str Target string to be applied between.
      * @param start A string for separating substring at the front.
      * @param end A string for separating substring at the end.
      *
      * @return substring by specified terms.
      */
    def between(str: java.lang.String): java.lang.String = js.native
    def between(str: java.lang.String, start: java.lang.String): java.lang.String = js.native
    def between(str: java.lang.String, start: java.lang.String, end: java.lang.String): java.lang.String = js.native
    /**
      * Fetch substrings.
      *
      * Splits a string into an array of substrings dividing by specified delimeters of start and end.
      * It's the array of substrings adjusted the between.
      *
      * <ul>
      *	<li> If startStr is omitted, it's same with the split by endStr not having last item. </li>
      *	<li> If endStr is omitted, it's same with the split by startStr not having first item. </li>
      *	<li> If startStr and endStar are all omitted, returns *str*. </li>
      * </ul>
      *
      * @param str Target string to split by between.
      * @param start A string for separating substring at the front.
      *				If omitted, it's same with split(end) not having last item.
      * @param end A string for separating substring at the end.
      *			  If omitted, it's same with split(start) not having first item.
      * @return An array of substrings.
      */
    def betweens(str: java.lang.String): js.Array[java.lang.String] = js.native
    def betweens(str: java.lang.String, start: java.lang.String): js.Array[java.lang.String] = js.native
    def betweens(str: java.lang.String, start: java.lang.String, end: java.lang.String): js.Array[java.lang.String] = js.native
    /**
      * Remove all designated characters from the beginning of the specified string.
      *
      * @param str The string should be trimmed.
      * @param delims Designated character(s).
      *
      * @return Updated string where designated characters was removed from the beginning
      */
    def ltrim(str: java.lang.String, args: java.lang.String*): java.lang.String = js.native
    /**
      * Number to formatted string with &quot;,&quot; sign.
      *
      * Returns a string converted from the number rounded off from specified precision with &quot;,&quot; symbols.
      *
      * @param val A number wants to convert to string.
      * @param precision Target precision of round off.
      *
      * @return A string who represents the number with roundoff and &quot;,&quot; symbols.
      */
    def numberFormat(`val`: scala.Double): java.lang.String = js.native
    def numberFormat(`val`: scala.Double, precision: scala.Double): java.lang.String = js.native
    def percentFormat(`val`: scala.Double): java.lang.String = js.native
    def percentFormat(`val`: scala.Double, precision: scala.Double): java.lang.String = js.native
    /**
      * Replace all HTML spaces to a literal space.
      *
      * @param str Target string to replace.
      */
    def removeHTMLSpaces(str: java.lang.String): java.lang.String = js.native
    /**
      * Repeat a string.
      *
      * Returns a string consisting of a specified string concatenated with itself a specified number of times.
      *
      * @param str The string to be repeated.
      * @param n The repeat count.
      *
      * @return The repeated string.
      */
    def repeat(str: java.lang.String, n: scala.Double): java.lang.String = js.native
    /**
      * Returns a string specified word is replaced.
      *
      * @param str Target string to replace
      * @param before Specific word you want to be replaced
      * @param after Specific word you want to replace
      *
      * @return A string specified word is replaced
      */
    def replaceAll(str: java.lang.String, before: java.lang.String, after: java.lang.String): java.lang.String = js.native
    /**
      * Returns a string specified words are replaced.
      *
      * @param str Target string to replace
      * @param pairs A specific word's pairs you want to replace and to be replaced
      *
      * @return A string specified words are replaced
      */
    def replaceAll(str: java.lang.String, pairs: (tstlLib.tstlMod.Pair[java.lang.String, java.lang.String])*): java.lang.String = js.native
    /**
      * Remove all designated characters from the end of the specified string.
      *
      * @param str The string should be trimmed.
      * @param delims Designated character(s).
      *
      * @return Updated string where designated characters was removed from the end.
      */
    def rtrim(str: java.lang.String, args: java.lang.String*): java.lang.String = js.native
    /**
      * Substitute `{n}` tokens within the specified string.
      *
      * @param format The string to make substitutions in. This string can contain special tokens of the form
      *				 `{n}`, where *n* is a zero based index, that will be replaced with the additional parameters
      *				 found at that index if specified.
      * @param args Additional parameters that can be substituted in the *format* parameter at each
      *			   `{n}` location, where *n* is an integer (zero based) index value into the array of values
      *			   specified.
      *
      * @return New string with all of the `{n}` tokens replaced with the respective arguments specified.
      */
    def substitute(format: java.lang.String, args: js.Any*): java.lang.String = js.native
    /**
      * Substitute `{n}` tokens within the specified SQL-string.
      *
      * @param format The string to make substitutions in. This string can contain special tokens of the form
      *				 `{n}`, where *n* is a zero based index, that will be replaced with the additional parameters
      *				 found at that index if specified.
      * @param args Additional parameters that can be substituted in the *format* parameter at each
      *			   `{n}` location, where *n* is an integer (zero based) index value into the array of values
      *			   specified.
      *
      * @return New SQL-string with all of the `{n}` tokens replaced with the respective arguments specified.
      */
    def substituteSQL(format: java.lang.String, args: js.Any*): java.lang.String = js.native
    /**
      * Remove all designated characters from the beginning and end of the specified string.
      *
      * @param str The string whose designated characters should be trimmed.
      * @param args Designated character(s).
      *
      * @return Updated string where designated characters was removed from the beginning and end.
      */
    def trim(str: java.lang.String, args: java.lang.String*): java.lang.String = js.native
  }
  
  @JSName("URLVariables")
  @js.native
  object URLVariablesNs extends js.Object {
    def parse[T](str: java.lang.String): T = js.native
    def parse[T](str: java.lang.String, autoCase: scala.Boolean): T = js.native
    def stringify[T](obj: T): java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object XML extends js.Object {
    /**
      * @hidden
      */
    var _Compute_min_index: js.Any = js.native
    /**
      * @hidden
      */
    var _Repeat: js.Any = js.native
  }
  
  @JSName("XML")
  @js.native
  object XMLNs extends js.Object {
    def decode_property(str: java.lang.String): java.lang.String = js.native
    def decode_value(str: java.lang.String): java.lang.String = js.native
    def encode_property(str: java.lang.String): java.lang.String = js.native
    def encode_value(str: java.lang.String): java.lang.String = js.native
    def head(): java.lang.String = js.native
    def head(encoding: java.lang.String): java.lang.String = js.native
  }
  
}

