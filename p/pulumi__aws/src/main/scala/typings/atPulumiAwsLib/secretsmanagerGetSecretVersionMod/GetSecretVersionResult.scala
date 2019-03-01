package typings
package atPulumiAwsLib.secretsmanagerGetSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretVersionResult extends js.Object {
  /**
    * The ARN of the secret.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
    */
  val secretBinary: java.lang.String
  /**
    * The decrypted part of the protected secret information that was originally provided as a string.
    */
  val secretString: java.lang.String
  /**
    * The unique identifier of this version of the secret.
    */
  val versionId: java.lang.String
  val versionStages: js.Array[java.lang.String]
}

object GetSecretVersionResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    id: java.lang.String,
    secretBinary: java.lang.String,
    secretString: java.lang.String,
    versionId: java.lang.String,
    versionStages: js.Array[java.lang.String]
  ): GetSecretVersionResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, secretBinary = secretBinary, secretString = secretString, versionId = versionId, versionStages = versionStages)
  
    __obj.asInstanceOf[GetSecretVersionResult]
  }
}

