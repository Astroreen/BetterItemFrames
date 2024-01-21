package me.astroreen.betteritemframes.listeners;

import me.astroreen.astrolibs.api.bukkit.listener.EventListener;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.checkerframework.checker.nullness.qual.NonNull;

public class PlayerInteractEntityEventListener extends EventListener {

  @EventHandler(priority = EventPriority.HIGHEST)
  public void onPlayerInteractEntityEvent(final @NonNull PlayerInteractEntityEvent event){
    Entity entity = event.getRightClicked();
    if(entity instanceof ItemFrame frame) {
      if(event.getPlayer().isSneaking()) return;
      //get block behind itemframe and click on it,
      //if it is a container
      event.setCancelled(true);
    }
  }

  @Override
  public String getName() {
    return "entity-interact";
  }
}
