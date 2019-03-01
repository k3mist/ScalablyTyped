package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The virtual class thrown for all Couchnode errors.
  */
trait CouchbaseError
  extends nodeLib.Error {
  /**
    * The error code for this error.
    */
  var code: js.UndefOr[errors] = js.undefined
  /**
    * Possible inner error for this error.
    */
  var innerError: js.UndefOr[CouchbaseError] = js.undefined
  /**
    * Possible response body included with the error.
    */
  var responseBody: js.UndefOr[js.Any] = js.undefined
}

object CouchbaseError {
  @scala.inline
  def apply(
    code: errors = null,
    innerError: CouchbaseError = null,
    responseBody: js.Any = null,
    stack: java.lang.String = null
  ): CouchbaseError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (innerError != null) __obj.updateDynamic("innerError")(innerError)
    if (responseBody != null) __obj.updateDynamic("responseBody")(responseBody)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CouchbaseError]
  }
}

