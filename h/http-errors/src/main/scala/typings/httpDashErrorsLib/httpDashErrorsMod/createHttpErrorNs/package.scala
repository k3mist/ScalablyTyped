package typings
package httpDashErrorsLib.httpDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createHttpErrorNs {
  type CreateHttpError = js.Function1[
    /* repeated */ stdLib.Error | java.lang.String | scala.Double | org.scalablytyped.runtime.StringDictionary[js.Any], 
    HttpError
  ]
  type HttpErrorConstructor = org.scalablytyped.runtime.Instantiable1[/* msg */ js.UndefOr[/* msg */ java.lang.String], HttpError]
  type NamedConstructors = httpDashErrorsLib.Anon_Code with (stdLib.Record[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 82 */ js.Any, 
    HttpErrorConstructor
  ])
}
