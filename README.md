# BML's Transit Expansion
BML's Transit Expansion is an expansion mod for the MTR mod. This mod adds new custom gates and new platform blocks. You can refer to the video on Bilibili for more details.

# ChangeLog for version 1.1.0 Beta 1
### What's added
- Gate (C5781, C5781 wide)
- Decorative wide gate (C3025, C5781)
- Glass Fence Corner Block (Inner, Outer)
- You can now use the brush to edit the state of the decorative wide gate
- You can now use the brush to edit the door type of the platform block
- Improved RAM usage when this mod is installed
- Redesigned the glass layer for Gate C3025
- Added "L" and "R" labels for the Gate Glass Fence
### What's removed
- Platform Block's nbt : "Style"
### What's fixed
- Some of the layers shown in Gate C3025 might be transparent
- High RAM usage when using this mod
# Dependencies
### Fabric
- [Minecraft Transit Railway](https://modrinth.com/mod/minecraft-transit-railway) v4.0.0 or above
- [Joban Client Mod](https://modrinth.com/mod/jcm) v2.0.0 or above
- [Filters API](https://modrinth.com/mod/filters-api) v1.0.0 or above
### Forge
- [Minecraft Transit Railway](https://modrinth.com/mod/minecraft-transit-railway) v4.0.0 or above
- [Joban Client Mod](https://modrinth.com/mod/jcm) v2.0.0 or above



---
## Setup

1. Clone this repository
2. Sync the Gradle project
3. To switch Minecraft versions or on first run:
    1. Sync the Gradle Project
    2. In the root project, run the Gradle `setupLibrary` task
    3. Sync the Gradle Project again

## Build Jar

1. Sync the Gradle project
2. Run the Gradle `build` task

This mod's code is based on [MTR-Russian-Metro-Addon](https://github.com/WerySkok/MTR-Russian-Metro-Addon).

## License
LGPL-3.0, see LICENSE.