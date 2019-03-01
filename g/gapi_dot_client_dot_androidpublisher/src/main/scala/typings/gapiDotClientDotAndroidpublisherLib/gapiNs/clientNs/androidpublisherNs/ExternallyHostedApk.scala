package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternallyHostedApk extends js.Object {
  /** The application label. */
  var applicationLabel: js.UndefOr[java.lang.String] = js.undefined
  /** A certificate (or array of certificates if a certificate-chain is used) used to signed this APK, represented as a base64 encoded byte array. */
  var certificateBase64s: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The URL at which the APK is hosted. This must be an https URL. */
  var externallyHostedUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The SHA1 checksum of this APK, represented as a base64 encoded byte array. */
  var fileSha1Base64: js.UndefOr[java.lang.String] = js.undefined
  /** The SHA256 checksum of this APK, represented as a base64 encoded byte array. */
  var fileSha256Base64: js.UndefOr[java.lang.String] = js.undefined
  /** The file size in bytes of this APK. */
  var fileSize: js.UndefOr[java.lang.String] = js.undefined
  /** The icon image from the APK, as a base64 encoded byte array. */
  var iconBase64: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum SDK supported by this APK (optional). */
  var maximumSdk: js.UndefOr[scala.Double] = js.undefined
  /** The minimum SDK targeted by this APK. */
  var minimumSdk: js.UndefOr[scala.Double] = js.undefined
  /** The native code environments supported by this APK (optional). */
  var nativeCodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The package name. */
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  /** The features required by this APK (optional). */
  var usesFeatures: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The permissions requested by this APK. */
  var usesPermissions: js.UndefOr[js.Array[ExternallyHostedApkUsesPermission]] = js.undefined
  /** The version code of this APK. */
  var versionCode: js.UndefOr[scala.Double] = js.undefined
  /** The version name of this APK. */
  var versionName: js.UndefOr[java.lang.String] = js.undefined
}

object ExternallyHostedApk {
  @scala.inline
  def apply(
    applicationLabel: java.lang.String = null,
    certificateBase64s: js.Array[java.lang.String] = null,
    externallyHostedUrl: java.lang.String = null,
    fileSha1Base64: java.lang.String = null,
    fileSha256Base64: java.lang.String = null,
    fileSize: java.lang.String = null,
    iconBase64: java.lang.String = null,
    maximumSdk: scala.Int | scala.Double = null,
    minimumSdk: scala.Int | scala.Double = null,
    nativeCodes: js.Array[java.lang.String] = null,
    packageName: java.lang.String = null,
    usesFeatures: js.Array[java.lang.String] = null,
    usesPermissions: js.Array[ExternallyHostedApkUsesPermission] = null,
    versionCode: scala.Int | scala.Double = null,
    versionName: java.lang.String = null
  ): ExternallyHostedApk = {
    val __obj = js.Dynamic.literal()
    if (applicationLabel != null) __obj.updateDynamic("applicationLabel")(applicationLabel)
    if (certificateBase64s != null) __obj.updateDynamic("certificateBase64s")(certificateBase64s)
    if (externallyHostedUrl != null) __obj.updateDynamic("externallyHostedUrl")(externallyHostedUrl)
    if (fileSha1Base64 != null) __obj.updateDynamic("fileSha1Base64")(fileSha1Base64)
    if (fileSha256Base64 != null) __obj.updateDynamic("fileSha256Base64")(fileSha256Base64)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize)
    if (iconBase64 != null) __obj.updateDynamic("iconBase64")(iconBase64)
    if (maximumSdk != null) __obj.updateDynamic("maximumSdk")(maximumSdk.asInstanceOf[js.Any])
    if (minimumSdk != null) __obj.updateDynamic("minimumSdk")(minimumSdk.asInstanceOf[js.Any])
    if (nativeCodes != null) __obj.updateDynamic("nativeCodes")(nativeCodes)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (usesFeatures != null) __obj.updateDynamic("usesFeatures")(usesFeatures)
    if (usesPermissions != null) __obj.updateDynamic("usesPermissions")(usesPermissions)
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName)
    __obj.asInstanceOf[ExternallyHostedApk]
  }
}

