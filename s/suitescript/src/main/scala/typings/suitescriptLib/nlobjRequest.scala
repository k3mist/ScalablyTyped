package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjRequest used for scripting web requests in Suitelets
  *
  * @classDescription Accessor to Http request data made available to Suitelets
  * @return {nlobjRequest}
  * @constructor
  */
@js.native
trait nlobjRequest
  extends /**
  *
  * @return
  */
org.scalablytyped.runtime.Instantiable0[js.Any] {
  /**
    * return an Object containing field names to file objects for all uploaded files.
    * @return {Object}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2009.1
    * @return
    */
  def getAllFiles(): js.Any = js.native
  /**
    * return an Object containing all the request headers and their values.
    * @return {Object}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @return
    */
  def getAllHeaders(): js.Any = js.native
  /**
    * return an Object containing all the request parameters and their values.
    * @return {Object}
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @return
    */
  def getAllParameters(): js.Any = js.native
  /**
    * return the body of the POST request
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    * @since 2008.1
    * @return
    */
  def getBody(): js.Any = js.native
  /**
    * return the value of an uploaded file.
    * @param {string} name file field name
    * @return {nlobjFile}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2009.1
    * @param name
    * @return
    */
  def getFile(name: java.lang.String): nlobjFile = js.native
  /**
    * return the value of a request header.
    * @param {string} name
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param name
    * @return
    */
  def getHeader(name: java.lang.String): java.lang.String = js.native
  /**
    * return the number of lines in a sublist.
    * @param {string} group sublist name
    * @return {int}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param group
    * @return
    */
  def getLineItemCount(group: java.lang.String): java.lang.String | scala.Double = js.native
  /**
    * return the value of a sublist value.
    * @param {string}    group sublist name
    * @param {string}    name  sublist field name
    * @param {int}    line  sublist line number
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param group
    * @param name
    * @param line
    * @return
    */
  def getLineItemValue(group: java.lang.String, name: java.lang.String, line: js.Any): java.lang.String = js.native
  /**
    * return the METHOD of the request
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    * @since 2008.1
    * @return
    */
  def getMethod(): java.lang.String = js.native
  /**
    * return the value of a request parameter.
    *
    * @param {string} name parameter name
    * @return {string}
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param name
    * @return
    */
  def getParameter(name: java.lang.String): java.lang.String = js.native
  /**
    * return the values of a request parameter as an Array.
    *
    * @param {string} name parameter name
    * @return {string[]}
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param name
    */
  def getParameterValues(name: java.lang.String): scala.Unit = js.native
  /**
    * return the URL of the request
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    * @since 2008.1
    * @return
    */
  def getURL(): java.lang.String = js.native
}

