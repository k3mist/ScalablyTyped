package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictRenameRename extends GitConflict {
  var baseBlob: GitBlobRef
  var originalPath: java.lang.String
  var resolution: GitResolutionMergeContent
  var sourceBlob: GitBlobRef
  var targetBlob: GitBlobRef
}

object GitConflictRenameRename {
  @scala.inline
  def apply(
    _links: js.Any,
    baseBlob: GitBlobRef,
    conflictId: scala.Double,
    conflictPath: java.lang.String,
    conflictType: GitConflictType,
    mergeBaseCommit: GitCommitRef,
    mergeOrigin: GitMergeOriginRef,
    mergeSourceCommit: GitCommitRef,
    mergeTargetCommit: GitCommitRef,
    originalPath: java.lang.String,
    resolution: GitResolutionMergeContent,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    resolvedDate: stdLib.Date,
    sourceBlob: GitBlobRef,
    targetBlob: GitBlobRef,
    url: java.lang.String
  ): GitConflictRenameRename = {
    val __obj = js.Dynamic.literal(_links = _links, baseBlob = baseBlob, conflictId = conflictId, conflictPath = conflictPath, conflictType = conflictType, mergeBaseCommit = mergeBaseCommit, mergeOrigin = mergeOrigin, mergeSourceCommit = mergeSourceCommit, mergeTargetCommit = mergeTargetCommit, originalPath = originalPath, resolution = resolution, resolutionError = resolutionError, resolutionStatus = resolutionStatus, resolvedBy = resolvedBy, resolvedDate = resolvedDate, sourceBlob = sourceBlob, targetBlob = targetBlob, url = url)
  
    __obj.asInstanceOf[GitConflictRenameRename]
  }
}

