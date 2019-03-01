package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFiberRootProperties extends js.Object {
  // Any additional information from the host associated with this root.
  var containerInfo: js.Any
  // Top context object, used by renderSubtreeIntoContainer
  var context: js.Object | scala.Null
  // The currently active root fiber. This is the mutable root of the tree.
  var current: Fiber
  // If an error is thrown, and there are no more updates in the queue, we try
  // rendering from the root one more time, synchronously, before handling
  // the error.
  var didError: scala.Boolean
  // The earliest and latest priority levels that are not known to be suspended.
  var earliestPendingTime: ExpirationTime
  // The following priority levels are used to distinguish between 1)
  // uncommitted work, 2) uncommitted work that is suspended, and 3) uncommitted
  // work that may be unsuspended. We choose not to track each individual
  // pending level, trading granularity for performance.
  //
  // The earliest and latest priority levels that are suspended from committing.
  var earliestSuspendedTime: ExpirationTime
  var expirationTime: ExpirationTime
  // A finished work-in-progress HostRoot that's ready to be committed.
  var finishedWork: Fiber | scala.Null
  // List of top-level batches. This list indicates whether a commit should be
  // deferred. Also contains completion callbacks.
  // TODO: Lift this into the renderer
  var firstBatch: Batch | scala.Null
  // Determines if we should attempt to hydrate on the initial mount
  val hydrate: scala.Boolean
  var latestPendingTime: ExpirationTime
  // The latest priority level that was pinged by a resolved promise and can
  // be retried.
  var latestPingedTime: ExpirationTime
  var latestSuspendedTime: ExpirationTime
  // Remaining expiration time on this root.
  // TODO: Lift this into the renderer
  var nextExpirationTimeToWorkOn: ExpirationTime
  // Linked-list of roots
  var nextScheduledRoot: FiberRoot | scala.Null
  // Used only by persistent updates.
  var pendingChildren: js.Any
  var pendingCommitExpirationTime: ExpirationTime
  var pendingContext: js.Object | scala.Null
  var pingCache: (stdLib.WeakMap[Thenable, stdLib.Set[ExpirationTime]]) | (stdLib.Map[Thenable, stdLib.Set[ExpirationTime]]) | scala.Null
  // Timeout handle returned by setTimeout. Used to cancel a pending timeout, if
  // it's superseded by a new one.
  var timeoutHandle: js.Any
}

object BaseFiberRootProperties {
  @scala.inline
  def apply(
    containerInfo: js.Any,
    current: Fiber,
    didError: scala.Boolean,
    earliestPendingTime: ExpirationTime,
    earliestSuspendedTime: ExpirationTime,
    expirationTime: ExpirationTime,
    hydrate: scala.Boolean,
    latestPendingTime: ExpirationTime,
    latestPingedTime: ExpirationTime,
    latestSuspendedTime: ExpirationTime,
    nextExpirationTimeToWorkOn: ExpirationTime,
    pendingChildren: js.Any,
    pendingCommitExpirationTime: ExpirationTime,
    timeoutHandle: js.Any,
    context: js.Object = null,
    finishedWork: Fiber = null,
    firstBatch: Batch = null,
    nextScheduledRoot: FiberRoot = null,
    pendingContext: js.Object = null,
    pingCache: (stdLib.WeakMap[Thenable, stdLib.Set[ExpirationTime]]) | (stdLib.Map[Thenable, stdLib.Set[ExpirationTime]]) = null
  ): BaseFiberRootProperties = {
    val __obj = js.Dynamic.literal(containerInfo = containerInfo, current = current, didError = didError, earliestPendingTime = earliestPendingTime, earliestSuspendedTime = earliestSuspendedTime, expirationTime = expirationTime, hydrate = hydrate, latestPendingTime = latestPendingTime, latestPingedTime = latestPingedTime, latestSuspendedTime = latestSuspendedTime, nextExpirationTimeToWorkOn = nextExpirationTimeToWorkOn, pendingChildren = pendingChildren, pendingCommitExpirationTime = pendingCommitExpirationTime, timeoutHandle = timeoutHandle)
    if (context != null) __obj.updateDynamic("context")(context)
    if (finishedWork != null) __obj.updateDynamic("finishedWork")(finishedWork)
    if (firstBatch != null) __obj.updateDynamic("firstBatch")(firstBatch)
    if (nextScheduledRoot != null) __obj.updateDynamic("nextScheduledRoot")(nextScheduledRoot)
    if (pendingContext != null) __obj.updateDynamic("pendingContext")(pendingContext)
    if (pingCache != null) __obj.updateDynamic("pingCache")(pingCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFiberRootProperties]
  }
}

