Floppy
=====================
#### The mod that makes your fish flop their way to the water.
This mod adds a small velocity adjustment to bring out-of-water fish toward the nearest water source. It also works with mobs that extend Minecraft's AbstractFish class.

## Compatibility (1.0.2)

Use the JAR matching your mod loader and Minecraft version.

| Loader | JAR | Minecraft versions |
| --- | --- | --- |
| Fabric | `floppy-1.0.2-fabric-mc1.21.1-1.21.8.jar` | 1.21.1–1.21.8 |
| Fabric | `floppy-1.0.2-fabric-mc1.21.10-1.21.11.jar` | 1.21.10–1.21.11 |
| NeoForge | `floppy-1.0.2-neoforge-mc1.21.1-1.21.8.jar` | 1.21.1–1.21.8 |
| NeoForge | `floppy-1.0.2-neoforge-mc1.21.10-1.21.11.jar` | 1.21.10–1.21.11 |

The NeoForge JARs are each compiled against the first Minecraft version in their range. Their metadata accepts NeoForge 21.1.x–21.8.x for the first JAR, and 21.10.x–21.11.x for the second. The fish mixin includes both package targets as pseudo mixins so that the package move between Minecraft releases does not require a third build.

Minecraft 1.21.9 is intentionally unsupported.

## Building

The default local NeoForge target is Minecraft 1.21.1. GitHub Actions builds both loader variants separately using the version matrix.

```bash
./gradlew :neoforge:build
```

## License

MIT. See [LICENSE.md](LICENSE.md).
