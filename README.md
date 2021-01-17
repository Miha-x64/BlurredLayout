# BlurredLayout

A layout that blurs some areas of underlying views.

# OBSOLETE

This was my first early attempt with many mistakes and misunderstandings.

Currently I use the following strategy:
* make a custom ViewGroup which I gonna blur partially
* add a view which will draw blur and be as small as possible
* override ViewGroup's `invalidate`, `onDescendantInvalidated` and `invalidateChildInParent`, and propagate invalidation to blur, if applicable
* when it's time to draw blur, create or reuse a Bitmap of required size divided by 4..8, draw required views into it through a scaled Canvas,
  apply blur (I use [modified allocation-free in-place version of Stack Blur](https://gist.github.com/Miha-x64/3fb489d13dbf69e1611a8fb688b57d3d)),
  apply clipping, if any, and draw blur
