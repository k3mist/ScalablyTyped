package typings
package atPulumiAwsLib.storagegatewayNfsFileShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NfsFileShareArgs extends js.Object {
  /**
    * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `["0.0.0.0/0"]` to not limit access. Minimum 1 item. Maximum 100 items.
    */
  val clientLists: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
    */
  val defaultStorageClass: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the file gateway.
    */
  val gatewayArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
    */
  val guessMimeTypeEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
    */
  val kmsEncrypted: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is true.
    */
  val kmsKeyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the backed storage used for storing file data.
    */
  val locationArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Nested argument with file share default values. More information below.
    */
  val nfsFileShareDefaults: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DirectoryModeFileMode]] = js.undefined
  /**
    * Access Control List permission for S3 bucket objects. Defaults to `private`.
    */
  val objectAcl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
    */
  val readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
    */
  val requesterPays: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
    */
  val roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
    */
  val squash: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object NfsFileShareArgs {
  @scala.inline
  def apply(
    clientLists: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    gatewayArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    locationArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    defaultStorageClass: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    guessMimeTypeEnabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    kmsEncrypted: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    kmsKeyArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    nfsFileShareDefaults: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DirectoryModeFileMode] = null,
    objectAcl: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    readOnly: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    requesterPays: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    squash: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): NfsFileShareArgs = {
    val __obj = js.Dynamic.literal(clientLists = clientLists.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], locationArn = locationArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (defaultStorageClass != null) __obj.updateDynamic("defaultStorageClass")(defaultStorageClass.asInstanceOf[js.Any])
    if (guessMimeTypeEnabled != null) __obj.updateDynamic("guessMimeTypeEnabled")(guessMimeTypeEnabled.asInstanceOf[js.Any])
    if (kmsEncrypted != null) __obj.updateDynamic("kmsEncrypted")(kmsEncrypted.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (nfsFileShareDefaults != null) __obj.updateDynamic("nfsFileShareDefaults")(nfsFileShareDefaults.asInstanceOf[js.Any])
    if (objectAcl != null) __obj.updateDynamic("objectAcl")(objectAcl.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (requesterPays != null) __obj.updateDynamic("requesterPays")(requesterPays.asInstanceOf[js.Any])
    if (squash != null) __obj.updateDynamic("squash")(squash.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsFileShareArgs]
  }
}

