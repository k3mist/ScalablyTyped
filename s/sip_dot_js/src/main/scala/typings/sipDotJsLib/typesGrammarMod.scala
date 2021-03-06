package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/grammar", JSImport.Namespace)
@js.native
object typesGrammarMod extends js.Object {
  @JSName("Grammar")
  @js.native
  object GrammarNs extends js.Object {
    def URIParse(uri: java.lang.String): js.UndefOr[sipDotJsLib.typesUriMod.URI] = js.native
    def nameAddrHeaderParse(nameAddrHeader: java.lang.String): js.UndefOr[sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
    def parse(input: java.lang.String, startRule: java.lang.String): js.Any = js.native
  }
  
}

