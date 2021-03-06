package typings
package awsDashSdkLib.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "Credentials")
@js.native
class Credentials protected ()
  extends awsDashSdkLib.libCoreMod.Credentials {
  /**
    * Creates a Credentials object with a given set of credential information as an options hash.
    *
    * @param {object} options - An option hash containing a set of credential information.
    */
  def this(options: awsDashSdkLib.libCredentialsMod.CredentialsOptions) = this()
  /**
    * Creates a Credentials object with a given set of credential information as positional arguments.
    *          *
    * @param {string} accessKeyId - The AWS access key ID.
    * @param {string} secretAccessKey - The AWS secret access key.
    * @param {string} sessionToken - The optional AWS session token.
    */
  def this(accessKeyId: java.lang.String, secretAccessKey: java.lang.String) = this()
  def this(accessKeyId: java.lang.String, secretAccessKey: java.lang.String, sessionToken: java.lang.String) = this()
}

/* static members */
@JSImport("aws-sdk", "Credentials")
@js.native
object Credentials extends js.Object {
  var expiryWindow: scala.Double = js.native
}

