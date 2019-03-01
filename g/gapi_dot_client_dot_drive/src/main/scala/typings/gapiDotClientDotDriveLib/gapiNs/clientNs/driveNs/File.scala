package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
    * A collection of arbitrary key-value pairs which are private to the requesting app.
    * Entries with null values are cleared in update and copy requests.
    */
  var appProperties: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Capabilities the current user has on this file. Each capability corresponds to a fine-grained action that a user may take. */
  var capabilities: js.UndefOr[gapiDotClientDotDriveLib.Anon_CanAddChildren] = js.undefined
  /** Additional information about the content of the file. These fields are never populated in responses. */
  var contentHints: js.UndefOr[gapiDotClientDotDriveLib.Anon_IndexableText] = js.undefined
  /** The time at which the file was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[java.lang.String] = js.undefined
  /** A short description of the file. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the file has been explicitly trashed, as opposed to recursively trashed from a parent folder. */
  var explicitlyTrashed: js.UndefOr[scala.Boolean] = js.undefined
  /** The final component of fullFileExtension. This is only available for files with binary content in Drive. */
  var fileExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color for a folder as an RGB hex string. The supported colors are published in the folderColorPalette field of the About resource.
    * If an unsupported color is specified, the closest color in the palette will be used instead.
    */
  var folderColorRgb: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The full file extension extracted from the name field. May contain multiple concatenated extensions, such as "tar.gz". This is only available for files
    * with binary content in Drive.
    * This is automatically updated when the name field changes, however it is not cleared if the new name does not contain a valid extension.
    */
  var fullFileExtension: js.UndefOr[java.lang.String] = js.undefined
  /** Whether any users are granted file access directly on this file. This field is only populated for Team Drive files. */
  var hasAugmentedPermissions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this file has a thumbnail. This does not indicate whether the requesting app has access to the thumbnail. To check access, look for the
    * presence of the thumbnailLink field.
    */
  var hasThumbnail: js.UndefOr[scala.Boolean] = js.undefined
  /** The ID of the file's head revision. This is currently only available for files with binary content in Drive. */
  var headRevisionId: js.UndefOr[java.lang.String] = js.undefined
  /** A static, unauthenticated link to the file's icon. */
  var iconLink: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the file. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Additional metadata about image media, if available. */
  var imageMediaMetadata: js.UndefOr[gapiDotClientDotDriveLib.Anon_Aperture] = js.undefined
  /** Whether the file was created or opened by the requesting app. */
  var isAppAuthorized: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#file". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The last user to modify the file. */
  var lastModifyingUser: js.UndefOr[User] = js.undefined
  /** The MD5 checksum for the content of the file. This is only applicable to files with binary content in Drive. */
  var md5Checksum: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The MIME type of the file.
    * Drive will attempt to automatically detect an appropriate value from uploaded content if no value is provided. The value cannot be changed unless a new
    * revision is uploaded.
    * If a file is created with a Google Doc MIME type, the uploaded content will be imported if possible. The supported import formats are published in the
    * About resource.
    */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the file has been modified by this user. */
  var modifiedByMe: js.UndefOr[scala.Boolean] = js.undefined
  /** The last time the file was modified by the user (RFC 3339 date-time). */
  var modifiedByMeTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The last time the file was modified by anyone (RFC 3339 date-time).
    * Note that setting modifiedTime will also update modifiedByMeTime for the user.
    */
  var modifiedTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the file. This is not necessarily unique within a folder. Note that for immutable items such as the top level folders of Team Drives, My
    * Drive root folder, and Application Data folder the name is constant.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The original filename of the uploaded content if available, or else the original value of the name field. This is only available for files with binary
    * content in Drive.
    */
  var originalFilename: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the user owns the file. Not populated for Team Drive files. */
  var ownedByMe: js.UndefOr[scala.Boolean] = js.undefined
  /** The owners of the file. Currently, only certain legacy files may have more than one owner. Not populated for Team Drive files. */
  var owners: js.UndefOr[js.Array[User]] = js.undefined
  /**
    * The IDs of the parent folders which contain the file.
    * If not specified as part of a create request, the file will be placed directly in the user's My Drive folder. If not specified as part of a copy
    * request, the file will inherit any discoverable parents of the source file. Update requests must use the addParents and removeParents parameters to
    * modify the parents list.
    */
  var parents: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of permission IDs for users with access to this file. */
  var permissionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The full list of permissions for the file. This is only available if the requesting user can share the file. Not populated for Team Drive files. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
  /**
    * A collection of arbitrary key-value pairs which are visible to all apps.
    * Entries with null values are cleared in update and copy requests.
    */
  var properties: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The number of storage quota bytes used by the file. This includes the head revision as well as previous revisions with keepForever enabled. */
  var quotaBytesUsed: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the file has been shared. Not populated for Team Drive files. */
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  /** The time at which the file was shared with the user, if applicable (RFC 3339 date-time). */
  var sharedWithMeTime: js.UndefOr[java.lang.String] = js.undefined
  /** The user who shared the file with the requesting user, if applicable. */
  var sharingUser: js.UndefOr[User] = js.undefined
  /** The size of the file's content in bytes. This is only applicable to files with binary content in Drive. */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** The list of spaces which contain the file. The currently supported values are 'drive', 'appDataFolder' and 'photos'. */
  var spaces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether the user has starred the file. */
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of the Team Drive the file resides in. */
  var teamDriveId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A short-lived link to the file's thumbnail, if available. Typically lasts on the order of hours. Only populated when the requesting app can access the
    * file's content.
    */
  var thumbnailLink: js.UndefOr[java.lang.String] = js.undefined
  /** The thumbnail version for use in thumbnail cache invalidation. */
  var thumbnailVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the file has been trashed, either explicitly or from a trashed parent folder. Only the owner may trash a file, and other users cannot see files
    * in the owner's trash.
    */
  var trashed: js.UndefOr[scala.Boolean] = js.undefined
  /** The time that the item was trashed (RFC 3339 date-time). Only populated for Team Drive files. */
  var trashedTime: js.UndefOr[java.lang.String] = js.undefined
  /** If the file has been explicitly trashed, the user who trashed it. Only populated for Team Drive files. */
  var trashingUser: js.UndefOr[User] = js.undefined
  /** A monotonically increasing version number for the file. This reflects every change made to the file on the server, even those not visible to the user. */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /** Additional metadata about video media. This may not be available immediately upon upload. */
  var videoMediaMetadata: js.UndefOr[gapiDotClientDotDriveLib.Anon_DurationMillis] = js.undefined
  /** Whether the file has been viewed by this user. */
  var viewedByMe: js.UndefOr[scala.Boolean] = js.undefined
  /** The last time the file was viewed by the user (RFC 3339 date-time). */
  var viewedByMeTime: js.UndefOr[java.lang.String] = js.undefined
  /** Whether users with only reader or commenter permission can copy the file's content. This affects copy, download, and print operations. */
  var viewersCanCopyContent: js.UndefOr[scala.Boolean] = js.undefined
  /** A link for downloading the content of the file in a browser. This is only available for files with binary content in Drive. */
  var webContentLink: js.UndefOr[java.lang.String] = js.undefined
  /** A link for opening the file in a relevant Google editor or viewer in a browser. */
  var webViewLink: js.UndefOr[java.lang.String] = js.undefined
  /** Whether users with only writer permission can modify the file's permissions. Not populated for Team Drive files. */
  var writersCanShare: js.UndefOr[scala.Boolean] = js.undefined
}

object File {
  @scala.inline
  def apply(
    appProperties: stdLib.Record[java.lang.String, java.lang.String] = null,
    capabilities: gapiDotClientDotDriveLib.Anon_CanAddChildren = null,
    contentHints: gapiDotClientDotDriveLib.Anon_IndexableText = null,
    createdTime: java.lang.String = null,
    description: java.lang.String = null,
    explicitlyTrashed: js.UndefOr[scala.Boolean] = js.undefined,
    fileExtension: java.lang.String = null,
    folderColorRgb: java.lang.String = null,
    fullFileExtension: java.lang.String = null,
    hasAugmentedPermissions: js.UndefOr[scala.Boolean] = js.undefined,
    hasThumbnail: js.UndefOr[scala.Boolean] = js.undefined,
    headRevisionId: java.lang.String = null,
    iconLink: java.lang.String = null,
    id: java.lang.String = null,
    imageMediaMetadata: gapiDotClientDotDriveLib.Anon_Aperture = null,
    isAppAuthorized: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    lastModifyingUser: User = null,
    md5Checksum: java.lang.String = null,
    mimeType: java.lang.String = null,
    modifiedByMe: js.UndefOr[scala.Boolean] = js.undefined,
    modifiedByMeTime: java.lang.String = null,
    modifiedTime: java.lang.String = null,
    name: java.lang.String = null,
    originalFilename: java.lang.String = null,
    ownedByMe: js.UndefOr[scala.Boolean] = js.undefined,
    owners: js.Array[User] = null,
    parents: js.Array[java.lang.String] = null,
    permissionIds: js.Array[java.lang.String] = null,
    permissions: js.Array[Permission] = null,
    properties: stdLib.Record[java.lang.String, java.lang.String] = null,
    quotaBytesUsed: java.lang.String = null,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    sharedWithMeTime: java.lang.String = null,
    sharingUser: User = null,
    size: java.lang.String = null,
    spaces: js.Array[java.lang.String] = null,
    starred: js.UndefOr[scala.Boolean] = js.undefined,
    teamDriveId: java.lang.String = null,
    thumbnailLink: java.lang.String = null,
    thumbnailVersion: java.lang.String = null,
    trashed: js.UndefOr[scala.Boolean] = js.undefined,
    trashedTime: java.lang.String = null,
    trashingUser: User = null,
    version: java.lang.String = null,
    videoMediaMetadata: gapiDotClientDotDriveLib.Anon_DurationMillis = null,
    viewedByMe: js.UndefOr[scala.Boolean] = js.undefined,
    viewedByMeTime: java.lang.String = null,
    viewersCanCopyContent: js.UndefOr[scala.Boolean] = js.undefined,
    webContentLink: java.lang.String = null,
    webViewLink: java.lang.String = null,
    writersCanShare: js.UndefOr[scala.Boolean] = js.undefined
  ): File = {
    val __obj = js.Dynamic.literal()
    if (appProperties != null) __obj.updateDynamic("appProperties")(appProperties)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (contentHints != null) __obj.updateDynamic("contentHints")(contentHints)
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(explicitlyTrashed)) __obj.updateDynamic("explicitlyTrashed")(explicitlyTrashed)
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension)
    if (folderColorRgb != null) __obj.updateDynamic("folderColorRgb")(folderColorRgb)
    if (fullFileExtension != null) __obj.updateDynamic("fullFileExtension")(fullFileExtension)
    if (!js.isUndefined(hasAugmentedPermissions)) __obj.updateDynamic("hasAugmentedPermissions")(hasAugmentedPermissions)
    if (!js.isUndefined(hasThumbnail)) __obj.updateDynamic("hasThumbnail")(hasThumbnail)
    if (headRevisionId != null) __obj.updateDynamic("headRevisionId")(headRevisionId)
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageMediaMetadata != null) __obj.updateDynamic("imageMediaMetadata")(imageMediaMetadata)
    if (!js.isUndefined(isAppAuthorized)) __obj.updateDynamic("isAppAuthorized")(isAppAuthorized)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifyingUser != null) __obj.updateDynamic("lastModifyingUser")(lastModifyingUser)
    if (md5Checksum != null) __obj.updateDynamic("md5Checksum")(md5Checksum)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (!js.isUndefined(modifiedByMe)) __obj.updateDynamic("modifiedByMe")(modifiedByMe)
    if (modifiedByMeTime != null) __obj.updateDynamic("modifiedByMeTime")(modifiedByMeTime)
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalFilename != null) __obj.updateDynamic("originalFilename")(originalFilename)
    if (!js.isUndefined(ownedByMe)) __obj.updateDynamic("ownedByMe")(ownedByMe)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (parents != null) __obj.updateDynamic("parents")(parents)
    if (permissionIds != null) __obj.updateDynamic("permissionIds")(permissionIds)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (quotaBytesUsed != null) __obj.updateDynamic("quotaBytesUsed")(quotaBytesUsed)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (sharedWithMeTime != null) __obj.updateDynamic("sharedWithMeTime")(sharedWithMeTime)
    if (sharingUser != null) __obj.updateDynamic("sharingUser")(sharingUser)
    if (size != null) __obj.updateDynamic("size")(size)
    if (spaces != null) __obj.updateDynamic("spaces")(spaces)
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred)
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId)
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink)
    if (thumbnailVersion != null) __obj.updateDynamic("thumbnailVersion")(thumbnailVersion)
    if (!js.isUndefined(trashed)) __obj.updateDynamic("trashed")(trashed)
    if (trashedTime != null) __obj.updateDynamic("trashedTime")(trashedTime)
    if (trashingUser != null) __obj.updateDynamic("trashingUser")(trashingUser)
    if (version != null) __obj.updateDynamic("version")(version)
    if (videoMediaMetadata != null) __obj.updateDynamic("videoMediaMetadata")(videoMediaMetadata)
    if (!js.isUndefined(viewedByMe)) __obj.updateDynamic("viewedByMe")(viewedByMe)
    if (viewedByMeTime != null) __obj.updateDynamic("viewedByMeTime")(viewedByMeTime)
    if (!js.isUndefined(viewersCanCopyContent)) __obj.updateDynamic("viewersCanCopyContent")(viewersCanCopyContent)
    if (webContentLink != null) __obj.updateDynamic("webContentLink")(webContentLink)
    if (webViewLink != null) __obj.updateDynamic("webViewLink")(webViewLink)
    if (!js.isUndefined(writersCanShare)) __obj.updateDynamic("writersCanShare")(writersCanShare)
    __obj.asInstanceOf[File]
  }
}

