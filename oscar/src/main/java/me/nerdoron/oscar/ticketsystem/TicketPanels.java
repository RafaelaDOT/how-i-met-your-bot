package me.nerdoron.oscar.ticketsystem;

import me.nerdoron.oscar.Global;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

public class TicketPanels {

        // admin ticket
        public static MessageEmbed AdminTickets = new EmbedBuilder().setTitle("📇 Admin Ticket").setDescription(
                        "Click the button below to contact the **Administraton Team**\nThis should be used "
                                        + "that the Admins need to handle, so punishment appeals, mod reports, and etc.\n\n*Be advised that response times here "
                                        + "will be longer, so please use the other ticket system if it's not important*")
                        .setColor(Global.embedColor)
                        .setFooter("how i met your bot | Developed by nerdoron",
                                        "https://media.discordapp.net/attachments/850432082738937896/901742492347691028/discord_bot_pfp.jpg")
                        .build();

        public static MessageEmbed adminWelcome = new EmbedBuilder().setTitle("📇 Admin Ticket ").setDescription(
                        "Hello, the administration team will be with you as soon as they can. In the meantime. please let us know what you need.\nTo close this ticket, use `*close`")
                        .setColor(Global.embedColor)
                        .setFooter("how i met your bot | Developed by nerdoron",
                                        "https://media.discordapp.net/attachments/850432082738937896/901742492347691028/discord_bot_pfp.jpg")
                        .build();
        // general ticket
        public static MessageEmbed GeneralTickets = new EmbedBuilder().setTitle("📇 Staff Ticket")
                        .setDescription("Click the button below to contact the staff team.").setColor(Global.embedColor)
                        .setFooter("how i met your bot | Developed by nerdoron",
                                        "https://media.discordapp.net/attachments/850432082738937896/901742492347691028/discord_bot_pfp.jpg")
                        .build();

        public static MessageEmbed generalWelcome = new EmbedBuilder().setTitle("📇 Staff Ticket ").setDescription(
                        "Hello, the staff team will be with you as soon as they can. In the meantime. please let us know what you need.\nTo close this ticket, use `*close`")
                        .setColor(Global.embedColor)
                        .setFooter("how i met your bot | Developed by nerdoron",
                                        "https://media.discordapp.net/attachments/850432082738937896/901742492347691028/discord_bot_pfp.jpg")
                        .build();
}
