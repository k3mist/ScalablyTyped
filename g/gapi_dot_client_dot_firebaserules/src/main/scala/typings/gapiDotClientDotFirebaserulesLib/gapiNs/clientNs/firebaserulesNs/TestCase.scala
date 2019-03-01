package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCase extends js.Object {
  /** Test expectation. */
  var expectation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional function mocks for service-defined functions. If not set, any
    * service defined function is expected to return an error, which may or may
    * not influence the test outcome.
    */
  var functionMocks: js.UndefOr[js.Array[FunctionMock]] = js.undefined
  /**
    * Request context.
    *
    * The exact format of the request context is service-dependent. See the
    * appropriate service documentation for information about the supported
    * fields and types on the request. Minimally, all services support the
    * following fields and types:
    *
    * Request field  | Type
    * ---------------|-----------------
    * auth.uid       | `string`
    * auth.token     | `map<string, string>`
    * headers        | `map<string, string>`
    * method         | `string`
    * params         | `map<string, string>`
    * path           | `string`
    * time           | `google.protobuf.Timestamp`
    *
    * If the request value is not well-formed for the service, the request will
    * be rejected as an invalid argument.
    */
  var request: js.UndefOr[js.Any] = js.undefined
  /**
    * Optional resource value as it appears in persistent storage before the
    * request is fulfilled.
    *
    * The resource type depends on the `request.path` value.
    */
  var resource: js.UndefOr[js.Any] = js.undefined
}

object TestCase {
  @scala.inline
  def apply(
    expectation: java.lang.String = null,
    functionMocks: js.Array[FunctionMock] = null,
    request: js.Any = null,
    resource: js.Any = null
  ): TestCase = {
    val __obj = js.Dynamic.literal()
    if (expectation != null) __obj.updateDynamic("expectation")(expectation)
    if (functionMocks != null) __obj.updateDynamic("functionMocks")(functionMocks)
    if (request != null) __obj.updateDynamic("request")(request)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[TestCase]
  }
}

