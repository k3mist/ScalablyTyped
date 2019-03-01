package typings
package atPulumiAwsLib.iamServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerCertificateArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the server certificate.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The contents of the public key certificate in
    * PEM-encoded format.
    */
  val certificateBody: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The contents of the certificate chain.
    * This is typically a concatenation of the PEM-encoded public key certificates
    * of the chain.
    */
  val certificateChain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the Server Certificate. Do not include the
    * path in this value. If omitted, Terraform will assign a random, unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM path for the server certificate.  If it is not
    * included, it defaults to a slash (/). If this certificate is for use with
    * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
    * See [IAM Identifiers][1] for more details on IAM Paths.
    */
  val path: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The contents of the private key in PEM-encoded format.
    */
  val privateKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object ServerCertificateArgs {
  @scala.inline
  def apply(
    certificateBody: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    privateKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    certificateChain: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    path: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): ServerCertificateArgs = {
    val __obj = js.Dynamic.literal(certificateBody = certificateBody.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateArgs]
  }
}

