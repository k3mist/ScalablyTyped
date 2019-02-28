package typings
package swDashPrecacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swDashPrecacheMod {
  type Generate = js.Function2[
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[
      js.Function2[
        /* error */ nodeLib.NodeJSNs.ErrnoException, 
        /* serviceWorkerString */ java.lang.String, 
        scala.Unit
      ]
    ], 
    js.Promise[java.lang.String]
  ]
  type Handler = _Handler | swDashToolboxLib.swDashToolboxMod.Handler
  type Write = js.Function3[
    /* filePath */ java.lang.String, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* error */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]], 
    js.Promise[java.lang.String]
  ]
}
