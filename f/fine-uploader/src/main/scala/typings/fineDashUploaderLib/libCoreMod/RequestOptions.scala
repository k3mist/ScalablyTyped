package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /**
    * Additional headers sent along with each upload request
    */
  var customHeaders: js.UndefOr[js.Any] = js.undefined
  /**
    * The endpoint to send upload requests to
    *
    * @default `'/server/upload'`
    */
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the parameter passed if the original filename has been edited or a `Blob` is being sent
    *
    * @default `'qqfilename'`
    */
  var filenameParam: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Force all uploads to use multipart encoding
    *
    * @default `true`
    */
  var forceMultipart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The attribute of the input element which will contain the file name.
    *
    * For non-multipart-encoded upload requests, this will be included as a parameter in the query string of the URI with a value equal to the file name
    *
    * @default `'qqfile'`
    */
  var inputName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify a method to use when sending files to a traditional endpoint. This option is ignored in older browsers (such as IE 9 and older)
    *
    * @default `'POST'`
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true, any Fine Uploader created parameters (qq*) will not be sent with the upload request
    * 
    * @default `false`
    */
  var omitDefaultParams: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The parameters that shall be sent with each upload request
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * Enable or disable sending parameters in the request body.
    *
    * If `false`, parameters are sent in the URL.
    * Otherwise, parameters are sent in the request body
    *
    * @default `true`
    */
  var paramsInBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, each upload response MUST contain a JSON message-body with `{success: true}` in order to be considered a success.
    * 
    * If set to false, the success of the request is determined by examining the response status code
    * 
    * @default `true`
    */
  var requireSuccessJson: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the parameter passed that specifies the total file size in bytes
    *
    * @default `'qqtotalfilesize'`
    */
  var totalFileSizeName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the parameter the uniquely identifies each associated item. The value is a Level 4 UUID
    *
    * @default `'qquuid'`
    */
  var uuidName: js.UndefOr[java.lang.String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    customHeaders: js.Any = null,
    endpoint: java.lang.String = null,
    filenameParam: java.lang.String = null,
    forceMultipart: js.UndefOr[scala.Boolean] = js.undefined,
    inputName: java.lang.String = null,
    method: java.lang.String = null,
    omitDefaultParams: js.UndefOr[scala.Boolean] = js.undefined,
    params: js.Any = null,
    paramsInBody: js.UndefOr[scala.Boolean] = js.undefined,
    requireSuccessJson: js.UndefOr[scala.Boolean] = js.undefined,
    totalFileSizeName: java.lang.String = null,
    uuidName: java.lang.String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (filenameParam != null) __obj.updateDynamic("filenameParam")(filenameParam)
    if (!js.isUndefined(forceMultipart)) __obj.updateDynamic("forceMultipart")(forceMultipart)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(omitDefaultParams)) __obj.updateDynamic("omitDefaultParams")(omitDefaultParams)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(paramsInBody)) __obj.updateDynamic("paramsInBody")(paramsInBody)
    if (!js.isUndefined(requireSuccessJson)) __obj.updateDynamic("requireSuccessJson")(requireSuccessJson)
    if (totalFileSizeName != null) __obj.updateDynamic("totalFileSizeName")(totalFileSizeName)
    if (uuidName != null) __obj.updateDynamic("uuidName")(uuidName)
    __obj.asInstanceOf[RequestOptions]
  }
}

