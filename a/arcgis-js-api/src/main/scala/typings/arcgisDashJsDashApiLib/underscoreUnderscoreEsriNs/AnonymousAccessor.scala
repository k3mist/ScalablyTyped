package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousAccessor
  extends stdLib.Object {
  var get: js.UndefOr[js.Function1[/* propertyName */ java.lang.String, _]] = js.undefined
  var set: js.UndefOr[
    (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, this.type]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], this.type])
  ] = js.undefined
  var watch: js.UndefOr[
    js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ]
  ] = js.undefined
}

