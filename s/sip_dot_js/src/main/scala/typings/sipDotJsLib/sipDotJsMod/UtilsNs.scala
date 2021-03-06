package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Utils")
@js.native
object UtilsNs extends js.Object {
  def buildStatusLine(code: scala.Double): java.lang.String = js.native
  def buildStatusLine(code: scala.Double, reason: java.lang.String): java.lang.String = js.native
  def createRandomToken(size: scala.Double): java.lang.String = js.native
  def createRandomToken(size: scala.Double, base: scala.Double): java.lang.String = js.native
  def escapeUser(user: java.lang.String): java.lang.String = js.native
  def generateFakeSDP(body: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getCancelReason(code: scala.Double, reason: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getReasonHeaderValue(code: scala.Double): java.lang.String = js.native
  def getReasonHeaderValue(code: scala.Double, reason: java.lang.String): java.lang.String = js.native
  def getReasonPhrase(code: scala.Double): java.lang.String = js.native
  def getReasonPhrase(code: scala.Double, specific: java.lang.String): java.lang.String = js.native
  def headerize(str: java.lang.String): java.lang.String = js.native
  def isDecimal(num: java.lang.String): scala.Boolean = js.native
  def newTag(): java.lang.String = js.native
  def newUUID(): java.lang.String = js.native
  def normalizeTarget(target: java.lang.String): js.UndefOr[sipDotJsLib.typesUriMod.URI] = js.native
  def normalizeTarget(target: java.lang.String, domain: java.lang.String): js.UndefOr[sipDotJsLib.typesUriMod.URI] = js.native
  def normalizeTarget(target: sipDotJsLib.typesUriMod.URI): js.UndefOr[sipDotJsLib.typesUriMod.URI] = js.native
  def normalizeTarget(target: sipDotJsLib.typesUriMod.URI, domain: java.lang.String): js.UndefOr[sipDotJsLib.typesUriMod.URI] = js.native
  def reducePromises(
    arr: js.Array[
      sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
    ],
    `val`: js.Any
  ): js.Promise[_] = js.native
  def sipErrorCause(statusCode: scala.Double): java.lang.String = js.native
  def str_utf8_length(str: java.lang.String): scala.Double = js.native
}

