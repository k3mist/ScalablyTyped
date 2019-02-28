package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#publickeycredential}
  */
trait PublicKeyCredential
  extends CredentialData
     with Credential {
  val rawId: stdLib.ArrayBuffer
  val response: AuthenticatorAttestationResponse | AuthenticatorAssertionResponse
  val `type`: PublicKeyCredentialType
}

