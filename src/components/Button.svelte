<script lang="ts">
    let { text, href, arrow = false }: {
        text: string;
        href: string;
        arrow?: boolean;
    } = $props();
</script>

<a class="bg-[#2053c0] text-white px-5 py-2 rounded-lg hover:bg-[#1a56db] w-fit shadow flex items-center gap-1" {href}>
    {text}
    {#if arrow}
        <img src="/icons/right-arrow.svg" class="w-4 h-4 ml-2 mt-0.5" alt="Right Arrow"/>
    {/if}
</a>