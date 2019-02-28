package typings
package avvioLib.avvioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object avvioNs {
  type OnClose[I, C] = js.Function1[/* fn */ js.Function2[/* context */ C, /* done */ js.Function, scala.Unit], C]
  type Plugin[O, I] = js.Function3[
    /* server */ context[I], 
    /* options */ O, 
    /* done */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
    scala.Unit
  ]
  type Use[I, C] = js.Function2[/* fn */ Plugin[js.Any, I], /* options */ js.UndefOr[js.Any], C]
  type context[I] = mixedInstance[I] | Avvio[I]
  type mixedInstance[I] = I with Server[I]
}
