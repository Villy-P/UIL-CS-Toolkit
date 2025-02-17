<script lang="ts">
    let { text, href, arrow = false, className = "" }: {
        text: string;
        href: string;
        arrow?: boolean;
        className?: string;
    } = $props();
</script>

<a class="bg-[#2053c0] text-white px-5 py-2 rounded-lg hover:bg-[#1a56db] btn w-fit shadow flex items-center gap-1 {className}" {href}>
    {text}
    {#if arrow}
        <img src="/icons/right-arrow.svg" class="w-4 h-4 ml-2 mt-0.5" alt="Right Arrow"/>
    {/if}
</a>

<style>
    .btn {
        color: white;
        text-decoration: none;
    }
</style>